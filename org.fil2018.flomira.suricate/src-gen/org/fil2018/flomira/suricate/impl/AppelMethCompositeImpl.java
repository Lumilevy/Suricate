/**
 * generated by Xtext 2.12.0
 */
package org.fil2018.flomira.suricate.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.fil2018.flomira.suricate.AppelMethComposite;
import org.fil2018.flomira.suricate.AppelMethSimple;
import org.fil2018.flomira.suricate.SuricatePackage;
import org.fil2018.flomira.suricate.Variable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Appel Meth Composite</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.fil2018.flomira.suricate.impl.AppelMethCompositeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.fil2018.flomira.suricate.impl.AppelMethCompositeImpl#getMethode <em>Methode</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AppelMethCompositeImpl extends AppelMethodeImpl implements AppelMethComposite
{
  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected Variable name;

  /**
   * The cached value of the '{@link #getMethode() <em>Methode</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMethode()
   * @generated
   * @ordered
   */
  protected EList<AppelMethSimple> methode;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AppelMethCompositeImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return SuricatePackage.Literals.APPEL_METH_COMPOSITE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Variable getName()
  {
    if (name != null && name.eIsProxy())
    {
      InternalEObject oldName = (InternalEObject)name;
      name = (Variable)eResolveProxy(oldName);
      if (name != oldName)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SuricatePackage.APPEL_METH_COMPOSITE__NAME, oldName, name));
      }
    }
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Variable basicGetName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(Variable newName)
  {
    Variable oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SuricatePackage.APPEL_METH_COMPOSITE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<AppelMethSimple> getMethode()
  {
    if (methode == null)
    {
      methode = new EObjectContainmentEList<AppelMethSimple>(AppelMethSimple.class, this, SuricatePackage.APPEL_METH_COMPOSITE__METHODE);
    }
    return methode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case SuricatePackage.APPEL_METH_COMPOSITE__METHODE:
        return ((InternalEList<?>)getMethode()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case SuricatePackage.APPEL_METH_COMPOSITE__NAME:
        if (resolve) return getName();
        return basicGetName();
      case SuricatePackage.APPEL_METH_COMPOSITE__METHODE:
        return getMethode();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SuricatePackage.APPEL_METH_COMPOSITE__NAME:
        setName((Variable)newValue);
        return;
      case SuricatePackage.APPEL_METH_COMPOSITE__METHODE:
        getMethode().clear();
        getMethode().addAll((Collection<? extends AppelMethSimple>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case SuricatePackage.APPEL_METH_COMPOSITE__NAME:
        setName((Variable)null);
        return;
      case SuricatePackage.APPEL_METH_COMPOSITE__METHODE:
        getMethode().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case SuricatePackage.APPEL_METH_COMPOSITE__NAME:
        return name != null;
      case SuricatePackage.APPEL_METH_COMPOSITE__METHODE:
        return methode != null && !methode.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //AppelMethCompositeImpl