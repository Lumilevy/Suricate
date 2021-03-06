/*
 * generated by Xtext 2.12.0
 */
package org.fil2018.flomira.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.fil2018.flomira.suricate.Ligne
import javax.inject.Inject
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.fil2018.flomira.suricate.Programme
import org.fil2018.flomira.suricate.Affectation
import org.fil2018.flomira.suricate.Instruction
import org.fil2018.flomira.suricate.AppelMethode
import org.fil2018.flomira.suricate.AppelMethSimple
import org.fil2018.flomira.suricate.Parametre

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class SuricateGenerator extends AbstractGenerator {
	
	@Inject extension IQualifiedNameProvider
	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		for(p : resource.allContents.toIterable.filter(Programme)) {
			fsa.generateFile("Main.java", p.compile);		
		}
	}
	
	def compile(Programme p)'''
import com.google.api.client.auth.oauth2.Credential;
import com.google.api.client.extensions.java6.auth.oauth2.AuthorizationCodeInstalledApp;
import com.google.api.client.extensions.jetty.auth.oauth2.LocalServerReceiver;
import com.google.api.client.googleapis.auth.oauth2.GoogleAuthorizationCodeFlow;
import com.google.api.client.googleapis.auth.oauth2.GoogleClientSecrets;
import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.util.Base64;
import com.google.api.client.util.store.FileDataStoreFactory;

import com.google.api.services.gmail.GmailScopes;
import com.google.api.services.gmail.model.*;
import com.google.api.services.gmail.Gmail;

import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.File;
import java.io.FileInputStream;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;

public class Main {
	/** Application name. */
private static final String APPLICATION_NAME =
        "Gmail API Java Quickstart";

/** Directory to store user credentials for this application. */
private static final java.io.File DATA_STORE_DIR = new java.io.File(
        System.getProperty("user.home"), ".credentials/gmail-java-quickstart");

/** Global instance of the {@link FileDataStoreFactory}. */
private static FileDataStoreFactory DATA_STORE_FACTORY;

/** Global instance of the JSON factory. */
private static final JsonFactory JSON_FACTORY =
        JacksonFactory.getDefaultInstance();

/** Global instance of the HTTP transport. */
private static HttpTransport HTTP_TRANSPORT;

private static final List<String> SCOPES =
            Arrays.asList(GmailScopes.GMAIL_LABELS);

    static {
        try {
            HTTP_TRANSPORT = GoogleNetHttpTransport.newTrustedTransport();
            DATA_STORE_FACTORY = new FileDataStoreFactory(DATA_STORE_DIR);
        } catch (Throwable t) {
            t.printStackTrace();
            System.exit(1);
        }
    }
    
    public static Credential authorize() throws IOException {
            // Load client secrets.
            InputStream in =
                    new FileInputStream(new File("resources/gmail_client_secret.json"));
            GoogleClientSecrets clientSecrets =
                    GoogleClientSecrets.load(JSON_FACTORY, new InputStreamReader(in));
    
            // Build flow and trigger user authorization request.
            GoogleAuthorizationCodeFlow flow =
                    new GoogleAuthorizationCodeFlow.Builder(
                            HTTP_TRANSPORT, JSON_FACTORY, clientSecrets, SCOPES)
                            .setDataStoreFactory(DATA_STORE_FACTORY)
                            .setAccessType("offline")
                            .build();
            Credential credential = new AuthorizationCodeInstalledApp(
                    flow, new LocalServerReceiver()).authorize("user");
            System.out.println(
                    "Credentials saved to " + DATA_STORE_DIR.getAbsolutePath());
            return credential;
     }
     
     public static Gmail Gmail() throws IOException {
             Credential credential = authorize();
             return new Gmail.Builder(HTTP_TRANSPORT, JSON_FACTORY, credential)
                     .setApplicationName(APPLICATION_NAME)
                     .build();
     }
	
	public static MimeMessage createEmail(Object to,
	                                          Object subject,
	                                          Object bodyText)
	            throws MessagingException {
	        Properties props = new Properties();
	        Session session = Session.getDefaultInstance(props, null);
	
	        MimeMessage email = new MimeMessage(session);
	
	        email.setFrom(new InternetAddress("me"));
	        email.addRecipient(javax.mail.Message.RecipientType.TO,
	                new InternetAddress((String) to));
	        email.setSubject((String) subject);
	        email.setText((String) bodyText);
	        return email;
	}
	
	public static Message createMessageWithEmail(Object emailContent)
	            throws MessagingException, IOException {
	        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
	        ((MimeMessage) emailContent).writeTo(buffer);
	        byte[] bytes = buffer.toByteArray();
	        String encodedEmail = Base64.encodeBase64URLSafeString(bytes);
	        Message message = new Message();
	        message.setRaw(encodedEmail);
	        return message;
	}
	
	public static Message sendMessage(Object service,
	                                      Object emailContent)
	            throws MessagingException, IOException {
        Message message = createMessageWithEmail(emailContent);
        message = ((Gmail) service).users().messages().send("me", message).execute();

        System.out.println("Message id: " + message.getId());
        System.out.println(message.toPrettyString());
        return message;
    }
	
    public static Draft createDraft(Object service,
                                    Object emailContent)
            throws MessagingException, IOException {
        Message message = createMessageWithEmail(emailContent);
        Draft draft = new Draft();
        draft.setMessage(message);
        draft = ((Gmail) service).users().drafts().create("me", draft).execute();

        System.out.println("Draft id: " + draft.getId());
        System.out.println(draft.toPrettyString());
        return draft;
    }
	
	public static void main(String[] args) throws IOException, MessagingException {
		�FOR l: p.elements�
			�l.compile�
		�ENDFOR�	
	}
}
'''
	
	def compile(Ligne l)'''
		�IF l.aff !== null�
			�l.aff.compile�
		�ELSE�
			�IF l.variable !== null�
				Object �l.variable.name� = �l.instr.compile�;
			�ELSE�
				�l.instr.compile�;
			�ENDIF�
		�ENDIF�
	'''
	
	def compile(Affectation a)'''
		Object �a.variable.name� = �a.valeur�;
	'''
	
	def compile(Instruction i)'''
		�IF i.methode !== null�
			�i.methode.compile�
		�ENDIF�
	'''
	
	def compile(AppelMethode a)'''
		�IF a.simple !== null�
			�a.simple.compile�
		�ENDIF�
	'''
	
	def compile(AppelMethSimple a)'''
		�a.methodeName�(�FOR p: a.params SEPARATOR ','� �p.compile� �ENDFOR�)
	'''
	
	def compile(Parametre p)'''
		�IF p.methode !== null�
			�p.methode.compile�
		�ENDIF�
		�IF p.variable !== null�
			�p.variable.name�
		�ENDIF�
		�IF p.valeur !== null�
			�p.valeur�
		�ENDIF�
	'''
}
