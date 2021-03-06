/**
 * generated by Xtext 2.12.0
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
      case SuricatePackage.INSTRUCTION: return createInstruction();
      case SuricatePackage.BOUCLE: return createBoucle();
      case SuricatePackage.IF_BOUCLE: return createIfBoucle();
      case SuricatePackage.APPEL_METHODE: return createAppelMethode();
      case SuricatePackage.APPEL_METH_COMPOSITE: return createAppelMethComposite();
      case SuricatePackage.VARIABLE: return createVariable();
      case SuricatePackage.APPEL_METH_SIMPLE: return createAppelMethSimple();
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
  public Instruction createInstruction()
  {
    InstructionImpl instruction = new InstructionImpl();
    return instruction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Boucle createBoucle()
  {
    BoucleImpl boucle = new BoucleImpl();
    return boucle;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IfBoucle createIfBoucle()
  {
    IfBoucleImpl ifBoucle = new IfBoucleImpl();
    return ifBoucle;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AppelMethode createAppelMethode()
  {
    AppelMethodeImpl appelMethode = new AppelMethodeImpl();
    return appelMethode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AppelMethComposite createAppelMethComposite()
  {
    AppelMethCompositeImpl appelMethComposite = new AppelMethCompositeImpl();
    return appelMethComposite;
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
  public AppelMethSimple createAppelMethSimple()
  {
    AppelMethSimpleImpl appelMethSimple = new AppelMethSimpleImpl();
    return appelMethSimple;
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
