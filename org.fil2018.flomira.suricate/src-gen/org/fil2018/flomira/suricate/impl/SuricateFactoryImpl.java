/**
 * generated by Xtext 2.10.0
 */
package org.fil2018.flomira.suricate.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.fil2018.flomira.suricate.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SuricateFactoryImpl extends EFactoryImpl implements SuricateFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static SuricateFactory init()
  {
    try
    {
      SuricateFactory theSuricateFactory = (SuricateFactory)EPackage.Registry.INSTANCE.getEFactory(SuricatePackage.eNS_URI);
      if (theSuricateFactory != null)
      {
        return theSuricateFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new SuricateFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SuricateFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case SuricatePackage.PROGRAMME: return createProgramme();
      case SuricatePackage.LIGNE: return createLigne();
      case SuricatePackage.AFFECTATION: return createAffectation();
      case SuricatePackage.VARIABLE: return createVariable();
      case SuricatePackage.OBJET: return createObjet();
      case SuricatePackage.INT_LITERAL: return createIntLiteral();
      case SuricatePackage.STRING_LITERAL: return createStringLiteral();
      case SuricatePackage.CONSTRUCTEUR: return createConstructeur();
      case SuricatePackage.OPERATION: return createOperation();
      case SuricatePackage.METHODE: return createMethode();
      case SuricatePackage.PARAMETRE: return createParametre();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Programme createProgramme()
  {
    ProgrammeImpl programme = new ProgrammeImpl();
    return programme;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Ligne createLigne()
  {
    LigneImpl ligne = new LigneImpl();
    return ligne;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Affectation createAffectation()
  {
    AffectationImpl affectation = new AffectationImpl();
    return affectation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Variable createVariable()
  {
    VariableImpl variable = new VariableImpl();
    return variable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Objet createObjet()
  {
    ObjetImpl objet = new ObjetImpl();
    return objet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntLiteral createIntLiteral()
  {
    IntLiteralImpl intLiteral = new IntLiteralImpl();
    return intLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringLiteral createStringLiteral()
  {
    StringLiteralImpl stringLiteral = new StringLiteralImpl();
    return stringLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Constructeur createConstructeur()
  {
    ConstructeurImpl constructeur = new ConstructeurImpl();
    return constructeur;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Operation createOperation()
  {
    OperationImpl operation = new OperationImpl();
    return operation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Methode createMethode()
  {
    MethodeImpl methode = new MethodeImpl();
    return methode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Parametre createParametre()
  {
    ParametreImpl parametre = new ParametreImpl();
    return parametre;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SuricatePackage getSuricatePackage()
  {
    return (SuricatePackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static SuricatePackage getPackage()
  {
    return SuricatePackage.eINSTANCE;
  }

} //SuricateFactoryImpl
