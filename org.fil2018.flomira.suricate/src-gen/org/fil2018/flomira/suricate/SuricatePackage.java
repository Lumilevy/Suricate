/**
 * generated by Xtext 2.12.0
 */
package org.fil2018.flomira.suricate;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.fil2018.flomira.suricate.SuricateFactory
 * @model kind="package"
 * @generated
 */
public interface SuricatePackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "suricate";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.fil2018.org/flomira/Suricate";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "suricate";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SuricatePackage eINSTANCE = org.fil2018.flomira.suricate.impl.SuricatePackageImpl.init();

  /**
   * The meta object id for the '{@link org.fil2018.flomira.suricate.impl.ProgrammeImpl <em>Programme</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.fil2018.flomira.suricate.impl.ProgrammeImpl
   * @see org.fil2018.flomira.suricate.impl.SuricatePackageImpl#getProgramme()
   * @generated
   */
  int PROGRAMME = 0;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAMME__ELEMENTS = 0;

  /**
   * The number of structural features of the '<em>Programme</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAMME_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.fil2018.flomira.suricate.impl.LigneImpl <em>Ligne</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.fil2018.flomira.suricate.impl.LigneImpl
   * @see org.fil2018.flomira.suricate.impl.SuricatePackageImpl#getLigne()
   * @generated
   */
  int LIGNE = 1;

  /**
   * The feature id for the '<em><b>Instr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIGNE__INSTR = 0;

  /**
   * The feature id for the '<em><b>Var</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIGNE__VAR = 1;

  /**
   * The feature id for the '<em><b>Aff</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIGNE__AFF = 2;

  /**
   * The number of structural features of the '<em>Ligne</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIGNE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.fil2018.flomira.suricate.impl.AffectationImpl <em>Affectation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.fil2018.flomira.suricate.impl.AffectationImpl
   * @see org.fil2018.flomira.suricate.impl.SuricatePackageImpl#getAffectation()
   * @generated
   */
  int AFFECTATION = 2;

  /**
   * The feature id for the '<em><b>Valeur</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AFFECTATION__VALEUR = 0;

  /**
   * The feature id for the '<em><b>Variable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AFFECTATION__VARIABLE = 1;

  /**
   * The number of structural features of the '<em>Affectation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AFFECTATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.fil2018.flomira.suricate.impl.ParametreImpl <em>Parametre</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.fil2018.flomira.suricate.impl.ParametreImpl
   * @see org.fil2018.flomira.suricate.impl.SuricatePackageImpl#getParametre()
   * @generated
   */
  int PARAMETRE = 10;

  /**
   * The number of structural features of the '<em>Parametre</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETRE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.fil2018.flomira.suricate.impl.InstructionImpl <em>Instruction</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.fil2018.flomira.suricate.impl.InstructionImpl
   * @see org.fil2018.flomira.suricate.impl.SuricatePackageImpl#getInstruction()
   * @generated
   */
  int INSTRUCTION = 3;

  /**
   * The number of structural features of the '<em>Instruction</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_FEATURE_COUNT = PARAMETRE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.fil2018.flomira.suricate.impl.BoucleImpl <em>Boucle</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.fil2018.flomira.suricate.impl.BoucleImpl
   * @see org.fil2018.flomira.suricate.impl.SuricatePackageImpl#getBoucle()
   * @generated
   */
  int BOUCLE = 4;

  /**
   * The number of structural features of the '<em>Boucle</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOUCLE_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.fil2018.flomira.suricate.impl.IfBoucleImpl <em>If Boucle</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.fil2018.flomira.suricate.impl.IfBoucleImpl
   * @see org.fil2018.flomira.suricate.impl.SuricatePackageImpl#getIfBoucle()
   * @generated
   */
  int IF_BOUCLE = 5;

  /**
   * The number of structural features of the '<em>If Boucle</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_BOUCLE_FEATURE_COUNT = BOUCLE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.fil2018.flomira.suricate.impl.AppelMethodeImpl <em>Appel Methode</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.fil2018.flomira.suricate.impl.AppelMethodeImpl
   * @see org.fil2018.flomira.suricate.impl.SuricatePackageImpl#getAppelMethode()
   * @generated
   */
  int APPEL_METHODE = 6;

  /**
   * The feature id for the '<em><b>If Body</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPEL_METHODE__IF_BODY = INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Appel Methode</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPEL_METHODE_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.fil2018.flomira.suricate.impl.AppelMethCompositeImpl <em>Appel Meth Composite</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.fil2018.flomira.suricate.impl.AppelMethCompositeImpl
   * @see org.fil2018.flomira.suricate.impl.SuricatePackageImpl#getAppelMethComposite()
   * @generated
   */
  int APPEL_METH_COMPOSITE = 7;

  /**
   * The feature id for the '<em><b>If Body</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPEL_METH_COMPOSITE__IF_BODY = APPEL_METHODE__IF_BODY;

  /**
   * The feature id for the '<em><b>Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPEL_METH_COMPOSITE__NAME = APPEL_METHODE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Methode</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPEL_METH_COMPOSITE__METHODE = APPEL_METHODE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Appel Meth Composite</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPEL_METH_COMPOSITE_FEATURE_COUNT = APPEL_METHODE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.fil2018.flomira.suricate.impl.VariableImpl <em>Variable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.fil2018.flomira.suricate.impl.VariableImpl
   * @see org.fil2018.flomira.suricate.impl.SuricatePackageImpl#getVariable()
   * @generated
   */
  int VARIABLE = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE__NAME = PARAMETRE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Variable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_FEATURE_COUNT = PARAMETRE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.fil2018.flomira.suricate.impl.AppelMethSimpleImpl <em>Appel Meth Simple</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.fil2018.flomira.suricate.impl.AppelMethSimpleImpl
   * @see org.fil2018.flomira.suricate.impl.SuricatePackageImpl#getAppelMethSimple()
   * @generated
   */
  int APPEL_METH_SIMPLE = 9;

  /**
   * The feature id for the '<em><b>If Body</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPEL_METH_SIMPLE__IF_BODY = APPEL_METHODE__IF_BODY;

  /**
   * The number of structural features of the '<em>Appel Meth Simple</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPEL_METH_SIMPLE_FEATURE_COUNT = APPEL_METHODE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.fil2018.flomira.suricate.impl.MethodeImpl <em>Methode</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.fil2018.flomira.suricate.impl.MethodeImpl
   * @see org.fil2018.flomira.suricate.impl.SuricatePackageImpl#getMethode()
   * @generated
   */
  int METHODE = 11;

  /**
   * The feature id for the '<em><b>If Body</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHODE__IF_BODY = APPEL_METH_SIMPLE__IF_BODY;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHODE__PARAMS = APPEL_METH_SIMPLE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Methode</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHODE_FEATURE_COUNT = APPEL_METH_SIMPLE_FEATURE_COUNT + 1;


  /**
   * Returns the meta object for class '{@link org.fil2018.flomira.suricate.Programme <em>Programme</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Programme</em>'.
   * @see org.fil2018.flomira.suricate.Programme
   * @generated
   */
  EClass getProgramme();

  /**
   * Returns the meta object for the containment reference list '{@link org.fil2018.flomira.suricate.Programme#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see org.fil2018.flomira.suricate.Programme#getElements()
   * @see #getProgramme()
   * @generated
   */
  EReference getProgramme_Elements();

  /**
   * Returns the meta object for class '{@link org.fil2018.flomira.suricate.Ligne <em>Ligne</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ligne</em>'.
   * @see org.fil2018.flomira.suricate.Ligne
   * @generated
   */
  EClass getLigne();

  /**
   * Returns the meta object for the containment reference '{@link org.fil2018.flomira.suricate.Ligne#getInstr <em>Instr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Instr</em>'.
   * @see org.fil2018.flomira.suricate.Ligne#getInstr()
   * @see #getLigne()
   * @generated
   */
  EReference getLigne_Instr();

  /**
   * Returns the meta object for the containment reference '{@link org.fil2018.flomira.suricate.Ligne#getVar <em>Var</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Var</em>'.
   * @see org.fil2018.flomira.suricate.Ligne#getVar()
   * @see #getLigne()
   * @generated
   */
  EReference getLigne_Var();

  /**
   * Returns the meta object for the containment reference '{@link org.fil2018.flomira.suricate.Ligne#getAff <em>Aff</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Aff</em>'.
   * @see org.fil2018.flomira.suricate.Ligne#getAff()
   * @see #getLigne()
   * @generated
   */
  EReference getLigne_Aff();

  /**
   * Returns the meta object for class '{@link org.fil2018.flomira.suricate.Affectation <em>Affectation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Affectation</em>'.
   * @see org.fil2018.flomira.suricate.Affectation
   * @generated
   */
  EClass getAffectation();

  /**
   * Returns the meta object for the attribute '{@link org.fil2018.flomira.suricate.Affectation#getValeur <em>Valeur</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Valeur</em>'.
   * @see org.fil2018.flomira.suricate.Affectation#getValeur()
   * @see #getAffectation()
   * @generated
   */
  EAttribute getAffectation_Valeur();

  /**
   * Returns the meta object for the containment reference '{@link org.fil2018.flomira.suricate.Affectation#getVariable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Variable</em>'.
   * @see org.fil2018.flomira.suricate.Affectation#getVariable()
   * @see #getAffectation()
   * @generated
   */
  EReference getAffectation_Variable();

  /**
   * Returns the meta object for class '{@link org.fil2018.flomira.suricate.Instruction <em>Instruction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Instruction</em>'.
   * @see org.fil2018.flomira.suricate.Instruction
   * @generated
   */
  EClass getInstruction();

  /**
   * Returns the meta object for class '{@link org.fil2018.flomira.suricate.Boucle <em>Boucle</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Boucle</em>'.
   * @see org.fil2018.flomira.suricate.Boucle
   * @generated
   */
  EClass getBoucle();

  /**
   * Returns the meta object for class '{@link org.fil2018.flomira.suricate.IfBoucle <em>If Boucle</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>If Boucle</em>'.
   * @see org.fil2018.flomira.suricate.IfBoucle
   * @generated
   */
  EClass getIfBoucle();

  /**
   * Returns the meta object for class '{@link org.fil2018.flomira.suricate.AppelMethode <em>Appel Methode</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Appel Methode</em>'.
   * @see org.fil2018.flomira.suricate.AppelMethode
   * @generated
   */
  EClass getAppelMethode();

  /**
   * Returns the meta object for the containment reference list '{@link org.fil2018.flomira.suricate.AppelMethode#getIfBody <em>If Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>If Body</em>'.
   * @see org.fil2018.flomira.suricate.AppelMethode#getIfBody()
   * @see #getAppelMethode()
   * @generated
   */
  EReference getAppelMethode_IfBody();

  /**
   * Returns the meta object for class '{@link org.fil2018.flomira.suricate.AppelMethComposite <em>Appel Meth Composite</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Appel Meth Composite</em>'.
   * @see org.fil2018.flomira.suricate.AppelMethComposite
   * @generated
   */
  EClass getAppelMethComposite();

  /**
   * Returns the meta object for the reference '{@link org.fil2018.flomira.suricate.AppelMethComposite#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Name</em>'.
   * @see org.fil2018.flomira.suricate.AppelMethComposite#getName()
   * @see #getAppelMethComposite()
   * @generated
   */
  EReference getAppelMethComposite_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.fil2018.flomira.suricate.AppelMethComposite#getMethode <em>Methode</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Methode</em>'.
   * @see org.fil2018.flomira.suricate.AppelMethComposite#getMethode()
   * @see #getAppelMethComposite()
   * @generated
   */
  EReference getAppelMethComposite_Methode();

  /**
   * Returns the meta object for class '{@link org.fil2018.flomira.suricate.Variable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable</em>'.
   * @see org.fil2018.flomira.suricate.Variable
   * @generated
   */
  EClass getVariable();

  /**
   * Returns the meta object for the attribute '{@link org.fil2018.flomira.suricate.Variable#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.fil2018.flomira.suricate.Variable#getName()
   * @see #getVariable()
   * @generated
   */
  EAttribute getVariable_Name();

  /**
   * Returns the meta object for class '{@link org.fil2018.flomira.suricate.AppelMethSimple <em>Appel Meth Simple</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Appel Meth Simple</em>'.
   * @see org.fil2018.flomira.suricate.AppelMethSimple
   * @generated
   */
  EClass getAppelMethSimple();

  /**
   * Returns the meta object for class '{@link org.fil2018.flomira.suricate.Parametre <em>Parametre</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parametre</em>'.
   * @see org.fil2018.flomira.suricate.Parametre
   * @generated
   */
  EClass getParametre();

  /**
   * Returns the meta object for class '{@link org.fil2018.flomira.suricate.Methode <em>Methode</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Methode</em>'.
   * @see org.fil2018.flomira.suricate.Methode
   * @generated
   */
  EClass getMethode();

  /**
   * Returns the meta object for the containment reference list '{@link org.fil2018.flomira.suricate.Methode#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Params</em>'.
   * @see org.fil2018.flomira.suricate.Methode#getParams()
   * @see #getMethode()
   * @generated
   */
  EReference getMethode_Params();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  SuricateFactory getSuricateFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.fil2018.flomira.suricate.impl.ProgrammeImpl <em>Programme</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.fil2018.flomira.suricate.impl.ProgrammeImpl
     * @see org.fil2018.flomira.suricate.impl.SuricatePackageImpl#getProgramme()
     * @generated
     */
    EClass PROGRAMME = eINSTANCE.getProgramme();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROGRAMME__ELEMENTS = eINSTANCE.getProgramme_Elements();

    /**
     * The meta object literal for the '{@link org.fil2018.flomira.suricate.impl.LigneImpl <em>Ligne</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.fil2018.flomira.suricate.impl.LigneImpl
     * @see org.fil2018.flomira.suricate.impl.SuricatePackageImpl#getLigne()
     * @generated
     */
    EClass LIGNE = eINSTANCE.getLigne();

    /**
     * The meta object literal for the '<em><b>Instr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LIGNE__INSTR = eINSTANCE.getLigne_Instr();

    /**
     * The meta object literal for the '<em><b>Var</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LIGNE__VAR = eINSTANCE.getLigne_Var();

    /**
     * The meta object literal for the '<em><b>Aff</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LIGNE__AFF = eINSTANCE.getLigne_Aff();

    /**
     * The meta object literal for the '{@link org.fil2018.flomira.suricate.impl.AffectationImpl <em>Affectation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.fil2018.flomira.suricate.impl.AffectationImpl
     * @see org.fil2018.flomira.suricate.impl.SuricatePackageImpl#getAffectation()
     * @generated
     */
    EClass AFFECTATION = eINSTANCE.getAffectation();

    /**
     * The meta object literal for the '<em><b>Valeur</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AFFECTATION__VALEUR = eINSTANCE.getAffectation_Valeur();

    /**
     * The meta object literal for the '<em><b>Variable</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AFFECTATION__VARIABLE = eINSTANCE.getAffectation_Variable();

    /**
     * The meta object literal for the '{@link org.fil2018.flomira.suricate.impl.InstructionImpl <em>Instruction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.fil2018.flomira.suricate.impl.InstructionImpl
     * @see org.fil2018.flomira.suricate.impl.SuricatePackageImpl#getInstruction()
     * @generated
     */
    EClass INSTRUCTION = eINSTANCE.getInstruction();

    /**
     * The meta object literal for the '{@link org.fil2018.flomira.suricate.impl.BoucleImpl <em>Boucle</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.fil2018.flomira.suricate.impl.BoucleImpl
     * @see org.fil2018.flomira.suricate.impl.SuricatePackageImpl#getBoucle()
     * @generated
     */
    EClass BOUCLE = eINSTANCE.getBoucle();

    /**
     * The meta object literal for the '{@link org.fil2018.flomira.suricate.impl.IfBoucleImpl <em>If Boucle</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.fil2018.flomira.suricate.impl.IfBoucleImpl
     * @see org.fil2018.flomira.suricate.impl.SuricatePackageImpl#getIfBoucle()
     * @generated
     */
    EClass IF_BOUCLE = eINSTANCE.getIfBoucle();

    /**
     * The meta object literal for the '{@link org.fil2018.flomira.suricate.impl.AppelMethodeImpl <em>Appel Methode</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.fil2018.flomira.suricate.impl.AppelMethodeImpl
     * @see org.fil2018.flomira.suricate.impl.SuricatePackageImpl#getAppelMethode()
     * @generated
     */
    EClass APPEL_METHODE = eINSTANCE.getAppelMethode();

    /**
     * The meta object literal for the '<em><b>If Body</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference APPEL_METHODE__IF_BODY = eINSTANCE.getAppelMethode_IfBody();

    /**
     * The meta object literal for the '{@link org.fil2018.flomira.suricate.impl.AppelMethCompositeImpl <em>Appel Meth Composite</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.fil2018.flomira.suricate.impl.AppelMethCompositeImpl
     * @see org.fil2018.flomira.suricate.impl.SuricatePackageImpl#getAppelMethComposite()
     * @generated
     */
    EClass APPEL_METH_COMPOSITE = eINSTANCE.getAppelMethComposite();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference APPEL_METH_COMPOSITE__NAME = eINSTANCE.getAppelMethComposite_Name();

    /**
     * The meta object literal for the '<em><b>Methode</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference APPEL_METH_COMPOSITE__METHODE = eINSTANCE.getAppelMethComposite_Methode();

    /**
     * The meta object literal for the '{@link org.fil2018.flomira.suricate.impl.VariableImpl <em>Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.fil2018.flomira.suricate.impl.VariableImpl
     * @see org.fil2018.flomira.suricate.impl.SuricatePackageImpl#getVariable()
     * @generated
     */
    EClass VARIABLE = eINSTANCE.getVariable();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE__NAME = eINSTANCE.getVariable_Name();

    /**
     * The meta object literal for the '{@link org.fil2018.flomira.suricate.impl.AppelMethSimpleImpl <em>Appel Meth Simple</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.fil2018.flomira.suricate.impl.AppelMethSimpleImpl
     * @see org.fil2018.flomira.suricate.impl.SuricatePackageImpl#getAppelMethSimple()
     * @generated
     */
    EClass APPEL_METH_SIMPLE = eINSTANCE.getAppelMethSimple();

    /**
     * The meta object literal for the '{@link org.fil2018.flomira.suricate.impl.ParametreImpl <em>Parametre</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.fil2018.flomira.suricate.impl.ParametreImpl
     * @see org.fil2018.flomira.suricate.impl.SuricatePackageImpl#getParametre()
     * @generated
     */
    EClass PARAMETRE = eINSTANCE.getParametre();

    /**
     * The meta object literal for the '{@link org.fil2018.flomira.suricate.impl.MethodeImpl <em>Methode</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.fil2018.flomira.suricate.impl.MethodeImpl
     * @see org.fil2018.flomira.suricate.impl.SuricatePackageImpl#getMethode()
     * @generated
     */
    EClass METHODE = eINSTANCE.getMethode();

    /**
     * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METHODE__PARAMS = eINSTANCE.getMethode_Params();

  }

} //SuricatePackage
