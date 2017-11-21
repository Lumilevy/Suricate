/**
 * generated by Xtext 2.12.0
 */
package org.fil2018.flomira.suricate;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ligne</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.fil2018.flomira.suricate.Ligne#getInstr <em>Instr</em>}</li>
 *   <li>{@link org.fil2018.flomira.suricate.Ligne#getVar <em>Var</em>}</li>
 *   <li>{@link org.fil2018.flomira.suricate.Ligne#getAff <em>Aff</em>}</li>
 * </ul>
 *
 * @see org.fil2018.flomira.suricate.SuricatePackage#getLigne()
 * @model
 * @generated
 */
public interface Ligne extends EObject
{
  /**
   * Returns the value of the '<em><b>Instr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Instr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Instr</em>' containment reference.
   * @see #setInstr(Instruction)
   * @see org.fil2018.flomira.suricate.SuricatePackage#getLigne_Instr()
   * @model containment="true"
   * @generated
   */
  Instruction getInstr();

  /**
   * Sets the value of the '{@link org.fil2018.flomira.suricate.Ligne#getInstr <em>Instr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Instr</em>' containment reference.
   * @see #getInstr()
   * @generated
   */
  void setInstr(Instruction value);

  /**
   * Returns the value of the '<em><b>Var</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Var</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Var</em>' containment reference.
   * @see #setVar(Variable)
   * @see org.fil2018.flomira.suricate.SuricatePackage#getLigne_Var()
   * @model containment="true"
   * @generated
   */
  Variable getVar();

  /**
   * Sets the value of the '{@link org.fil2018.flomira.suricate.Ligne#getVar <em>Var</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Var</em>' containment reference.
   * @see #getVar()
   * @generated
   */
  void setVar(Variable value);

  /**
   * Returns the value of the '<em><b>Aff</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Aff</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Aff</em>' containment reference.
   * @see #setAff(Affectation)
   * @see org.fil2018.flomira.suricate.SuricatePackage#getLigne_Aff()
   * @model containment="true"
   * @generated
   */
  Affectation getAff();

  /**
   * Sets the value of the '{@link org.fil2018.flomira.suricate.Ligne#getAff <em>Aff</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Aff</em>' containment reference.
   * @see #getAff()
   * @generated
   */
  void setAff(Affectation value);

} // Ligne
