/**
 * generated by Xtext 2.10.0
 */
package org.fil2018.flomira.suricate;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Programme</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.fil2018.flomira.suricate.Programme#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see org.fil2018.flomira.suricate.SuricatePackage#getProgramme()
 * @model
 * @generated
 */
public interface Programme extends EObject
{
  /**
   * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
   * The list contents are of type {@link org.fil2018.flomira.suricate.Ligne}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' containment reference list.
   * @see org.fil2018.flomira.suricate.SuricatePackage#getProgramme_Elements()
   * @model containment="true"
   * @generated
   */
  EList<Ligne> getElements();

} // Programme
