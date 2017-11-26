/**
 * generated by Xtext 2.12.0
 */
package org.fil2018.flomira.generator;

import com.google.common.collect.Iterables;
import javax.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.fil2018.flomira.suricate.Affectation;
import org.fil2018.flomira.suricate.AppelMethSimple;
import org.fil2018.flomira.suricate.AppelMethode;
import org.fil2018.flomira.suricate.Instruction;
import org.fil2018.flomira.suricate.Ligne;
import org.fil2018.flomira.suricate.Parametre;
import org.fil2018.flomira.suricate.Programme;
import org.fil2018.flomira.suricate.Variable;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class SuricateGenerator extends AbstractGenerator {
  @Inject
  @Extension
  private IQualifiedNameProvider _iQualifiedNameProvider;
  
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    Iterable<Programme> _filter = Iterables.<Programme>filter(IteratorExtensions.<EObject>toIterable(resource.getAllContents()), Programme.class);
    for (final Programme p : _filter) {
      fsa.generateFile("Main.java", this.compile(p));
    }
  }
  
  public CharSequence compile(final Programme p) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import com.google.api.client.auth.oauth2.Credential;");
    _builder.newLine();
    _builder.append("import com.google.api.client.extensions.java6.auth.oauth2.AuthorizationCodeInstalledApp;");
    _builder.newLine();
    _builder.append("import com.google.api.client.extensions.jetty.auth.oauth2.LocalServerReceiver;");
    _builder.newLine();
    _builder.append("import com.google.api.client.googleapis.auth.oauth2.GoogleAuthorizationCodeFlow;");
    _builder.newLine();
    _builder.append("import com.google.api.client.googleapis.auth.oauth2.GoogleClientSecrets;");
    _builder.newLine();
    _builder.append("import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport;");
    _builder.newLine();
    _builder.append("import com.google.api.client.http.HttpTransport;");
    _builder.newLine();
    _builder.append("import com.google.api.client.json.jackson2.JacksonFactory;");
    _builder.newLine();
    _builder.append("import com.google.api.client.json.JsonFactory;");
    _builder.newLine();
    _builder.append("import com.google.api.client.util.Base64;");
    _builder.newLine();
    _builder.append("import com.google.api.client.util.store.FileDataStoreFactory;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import com.google.api.services.gmail.GmailScopes;");
    _builder.newLine();
    _builder.append("import com.google.api.services.gmail.model.*;");
    _builder.newLine();
    _builder.append("import com.google.api.services.gmail.Gmail;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import javax.mail.MessagingException;");
    _builder.newLine();
    _builder.append("import javax.mail.Session;");
    _builder.newLine();
    _builder.append("import javax.mail.internet.InternetAddress;");
    _builder.newLine();
    _builder.append("import javax.mail.internet.MimeMessage;");
    _builder.newLine();
    _builder.append("import java.io.ByteArrayOutputStream;");
    _builder.newLine();
    _builder.append("import java.io.IOException;");
    _builder.newLine();
    _builder.append("import java.io.InputStream;");
    _builder.newLine();
    _builder.append("import java.io.InputStreamReader;");
    _builder.newLine();
    _builder.append("import java.io.File;");
    _builder.newLine();
    _builder.append("import java.io.FileInputStream;");
    _builder.newLine();
    _builder.append("import java.util.Arrays;");
    _builder.newLine();
    _builder.append("import java.util.List;");
    _builder.newLine();
    _builder.append("import java.util.Properties;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class Main {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("/** Application name. */");
    _builder.newLine();
    _builder.append("private static final String APPLICATION_NAME =");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("\"Gmail API Java Quickstart\";");
    _builder.newLine();
    _builder.newLine();
    _builder.append("/** Directory to store user credentials for this application. */");
    _builder.newLine();
    _builder.append("private static final java.io.File DATA_STORE_DIR = new java.io.File(");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("System.getProperty(\"user.home\"), \".credentials/gmail-java-quickstart\");");
    _builder.newLine();
    _builder.newLine();
    _builder.append("/** Global instance of the {@link FileDataStoreFactory}. */");
    _builder.newLine();
    _builder.append("private static FileDataStoreFactory DATA_STORE_FACTORY;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("/** Global instance of the JSON factory. */");
    _builder.newLine();
    _builder.append("private static final JsonFactory JSON_FACTORY =");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("JacksonFactory.getDefaultInstance();");
    _builder.newLine();
    _builder.newLine();
    _builder.append("/** Global instance of the HTTP transport. */");
    _builder.newLine();
    _builder.append("private static HttpTransport HTTP_TRANSPORT;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("private static final List<String> SCOPES =");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("Arrays.asList(GmailScopes.GMAIL_LABELS);");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("static {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("try {");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("HTTP_TRANSPORT = GoogleNetHttpTransport.newTrustedTransport();");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("DATA_STORE_FACTORY = new FileDataStoreFactory(DATA_STORE_DIR);");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("} catch (Throwable t) {");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("t.printStackTrace();");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("System.exit(1);");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public static Credential authorize() throws IOException {");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("// Load client secrets.");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("InputStream in =");
    _builder.newLine();
    _builder.append("                    ");
    _builder.append("new FileInputStream(new File(\"resources/gmail_client_secret.json\"));");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("GoogleClientSecrets clientSecrets =");
    _builder.newLine();
    _builder.append("                    ");
    _builder.append("GoogleClientSecrets.load(JSON_FACTORY, new InputStreamReader(in));");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("// Build flow and trigger user authorization request.");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("GoogleAuthorizationCodeFlow flow =");
    _builder.newLine();
    _builder.append("                    ");
    _builder.append("new GoogleAuthorizationCodeFlow.Builder(");
    _builder.newLine();
    _builder.append("                            ");
    _builder.append("HTTP_TRANSPORT, JSON_FACTORY, clientSecrets, SCOPES)");
    _builder.newLine();
    _builder.append("                            ");
    _builder.append(".setDataStoreFactory(DATA_STORE_FACTORY)");
    _builder.newLine();
    _builder.append("                            ");
    _builder.append(".setAccessType(\"offline\")");
    _builder.newLine();
    _builder.append("                            ");
    _builder.append(".build();");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("Credential credential = new AuthorizationCodeInstalledApp(");
    _builder.newLine();
    _builder.append("                    ");
    _builder.append("flow, new LocalServerReceiver()).authorize(\"user\");");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("System.out.println(");
    _builder.newLine();
    _builder.append("                    ");
    _builder.append("\"Credentials saved to \" + DATA_STORE_DIR.getAbsolutePath());");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("return credential;");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("     ");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("public static Gmail Gmail() throws IOException {");
    _builder.newLine();
    _builder.append("             ");
    _builder.append("Credential credential = authorize();");
    _builder.newLine();
    _builder.append("             ");
    _builder.append("return new Gmail.Builder(HTTP_TRANSPORT, JSON_FACTORY, credential)");
    _builder.newLine();
    _builder.append("                     ");
    _builder.append(".setApplicationName(APPLICATION_NAME)");
    _builder.newLine();
    _builder.append("                     ");
    _builder.append(".build();");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public static MimeMessage createEmail(Object to,");
    _builder.newLine();
    _builder.append("\t                                          ");
    _builder.append("Object subject,");
    _builder.newLine();
    _builder.append("\t                                          ");
    _builder.append("Object bodyText)");
    _builder.newLine();
    _builder.append("\t            ");
    _builder.append("throws MessagingException {");
    _builder.newLine();
    _builder.append("\t        ");
    _builder.append("Properties props = new Properties();");
    _builder.newLine();
    _builder.append("\t        ");
    _builder.append("Session session = Session.getDefaultInstance(props, null);");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t        ");
    _builder.append("MimeMessage email = new MimeMessage(session);");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t        ");
    _builder.append("email.setFrom(new InternetAddress(\"me\"));");
    _builder.newLine();
    _builder.append("\t        ");
    _builder.append("email.addRecipient(javax.mail.Message.RecipientType.TO,");
    _builder.newLine();
    _builder.append("\t                ");
    _builder.append("new InternetAddress((String) to));");
    _builder.newLine();
    _builder.append("\t        ");
    _builder.append("email.setSubject((String) subject);");
    _builder.newLine();
    _builder.append("\t        ");
    _builder.append("email.setText((String) bodyText);");
    _builder.newLine();
    _builder.append("\t        ");
    _builder.append("return email;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public static Message createMessageWithEmail(Object emailContent)");
    _builder.newLine();
    _builder.append("\t            ");
    _builder.append("throws MessagingException, IOException {");
    _builder.newLine();
    _builder.append("\t        ");
    _builder.append("ByteArrayOutputStream buffer = new ByteArrayOutputStream();");
    _builder.newLine();
    _builder.append("\t        ");
    _builder.append("((MimeMessage) emailContent).writeTo(buffer);");
    _builder.newLine();
    _builder.append("\t        ");
    _builder.append("byte[] bytes = buffer.toByteArray();");
    _builder.newLine();
    _builder.append("\t        ");
    _builder.append("String encodedEmail = Base64.encodeBase64URLSafeString(bytes);");
    _builder.newLine();
    _builder.append("\t        ");
    _builder.append("Message message = new Message();");
    _builder.newLine();
    _builder.append("\t        ");
    _builder.append("message.setRaw(encodedEmail);");
    _builder.newLine();
    _builder.append("\t        ");
    _builder.append("return message;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public static Message sendMessage(Object service,");
    _builder.newLine();
    _builder.append("\t                                      ");
    _builder.append("Object emailContent)");
    _builder.newLine();
    _builder.append("\t            ");
    _builder.append("throws MessagingException, IOException {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("Message message = createMessageWithEmail(emailContent);");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("message = ((Gmail) service).users().messages().send(\"me\", message).execute();");
    _builder.newLine();
    _builder.newLine();
    _builder.append("        ");
    _builder.append("System.out.println(\"Message id: \" + message.getId());");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("System.out.println(message.toPrettyString());");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("return message;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public static Draft createDraft(Object service,");
    _builder.newLine();
    _builder.append("                                    ");
    _builder.append("Object emailContent)");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("throws MessagingException, IOException {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("Message message = createMessageWithEmail(emailContent);");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("Draft draft = new Draft();");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("draft.setMessage(message);");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("draft = ((Gmail) service).users().drafts().create(\"me\", draft).execute();");
    _builder.newLine();
    _builder.newLine();
    _builder.append("        ");
    _builder.append("System.out.println(\"Draft id: \" + draft.getId());");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("System.out.println(draft.toPrettyString());");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("return draft;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public static void main(String[] args) throws IOException, MessagingException {");
    _builder.newLine();
    {
      EList<Ligne> _elements = p.getElements();
      for(final Ligne l : _elements) {
        _builder.append("\t\t");
        CharSequence _compile = this.compile(l);
        _builder.append(_compile, "\t\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compile(final Ligne l) {
    StringConcatenation _builder = new StringConcatenation();
    {
      Affectation _aff = l.getAff();
      boolean _tripleNotEquals = (_aff != null);
      if (_tripleNotEquals) {
        CharSequence _compile = this.compile(l.getAff());
        _builder.append(_compile);
        _builder.newLineIfNotEmpty();
      } else {
        {
          Variable _variable = l.getVariable();
          boolean _tripleNotEquals_1 = (_variable != null);
          if (_tripleNotEquals_1) {
            _builder.append("Object ");
            String _name = l.getVariable().getName();
            _builder.append(_name);
            _builder.append(" = ");
            CharSequence _compile_1 = this.compile(l.getInstr());
            _builder.append(_compile_1);
            _builder.append(";");
            _builder.newLineIfNotEmpty();
          } else {
            CharSequence _compile_2 = this.compile(l.getInstr());
            _builder.append(_compile_2);
            _builder.append(";");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    return _builder;
  }
  
  public CharSequence compile(final Affectation a) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Object ");
    String _name = a.getVariable().getName();
    _builder.append(_name);
    _builder.append(" = ");
    String _valeur = a.getValeur();
    _builder.append(_valeur);
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence compile(final Instruction i) {
    StringConcatenation _builder = new StringConcatenation();
    {
      AppelMethode _methode = i.getMethode();
      boolean _tripleNotEquals = (_methode != null);
      if (_tripleNotEquals) {
        CharSequence _compile = this.compile(i.getMethode());
        _builder.append(_compile);
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence compile(final AppelMethode a) {
    StringConcatenation _builder = new StringConcatenation();
    {
      AppelMethSimple _simple = a.getSimple();
      boolean _tripleNotEquals = (_simple != null);
      if (_tripleNotEquals) {
        CharSequence _compile = this.compile(a.getSimple());
        _builder.append(_compile);
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence compile(final AppelMethSimple a) {
    StringConcatenation _builder = new StringConcatenation();
    String _methodeName = a.getMethodeName();
    _builder.append(_methodeName);
    _builder.append("(");
    {
      EList<Parametre> _params = a.getParams();
      boolean _hasElements = false;
      for(final Parametre p : _params) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(",", "");
        }
        _builder.append(" ");
        CharSequence _compile = this.compile(p);
        _builder.append(_compile);
        _builder.append(" ");
      }
    }
    _builder.append(")");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence compile(final Parametre p) {
    StringConcatenation _builder = new StringConcatenation();
    {
      AppelMethode _methode = p.getMethode();
      boolean _tripleNotEquals = (_methode != null);
      if (_tripleNotEquals) {
        Object _compile = this.compile(p.getMethode());
        _builder.append(_compile);
        _builder.newLineIfNotEmpty();
      }
    }
    {
      Variable _variable = p.getVariable();
      boolean _tripleNotEquals_1 = (_variable != null);
      if (_tripleNotEquals_1) {
        String _name = p.getVariable().getName();
        _builder.append(_name);
        _builder.newLineIfNotEmpty();
      }
    }
    {
      String _valeur = p.getValeur();
      boolean _tripleNotEquals_2 = (_valeur != null);
      if (_tripleNotEquals_2) {
        String _valeur_1 = p.getValeur();
        _builder.append(_valeur_1);
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
}
