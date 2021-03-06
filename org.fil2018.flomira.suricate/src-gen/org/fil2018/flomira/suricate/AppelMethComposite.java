/**
 * generated by Xtext 2.12.0
 */
package org.fil2018.flomira.suricate;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Appel Meth Composite</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.fil2018.flomira.suricate.AppelMethComposite#getName <em>Name</em>}</li>
 *   <li>{@link org.fil2018.flomira.suricate.AppelMethComposite#getMethode <em>Methode</em>}</li>
 * </ul>
 *
 * @see org.fil2018.flomira.suricate.SuricatePackage#getAppelMethComposite()
 * @model
 * @generated
 */
public interface AppelMethComposite extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' reference.
   * @see #setName(Variable)
   * @see org.fil2018.flomira.suricate.SuricatePackage#getAppelMethComposite_Name()
   * @model
   * @generated
   */
  Variable getName();

  /**
   * Sets the value of the '{@link org.fil2018.flomira.suricate.AppelMethComposite#getName <em>Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' reference.
   * @see #getName()
   * @generated
   */
  void setName(Variable value);

  /**
   * Returns the value of the '<em><b>Methode</b></em>' containment reference list.
   * The list contents are of type {@link org.fil2018.flomira.suricate.AppelMethSimple}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Methode</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Methode</em>' containment reference list.
   * @see org.fil2018.flomira.suricate.SuricatePackage#getAppelMethComposite_Methode()
   * @model containment="true"
   * @generated
   */
  EList<AppelMethSimple> getMethode();

} // AppelMethComposite
