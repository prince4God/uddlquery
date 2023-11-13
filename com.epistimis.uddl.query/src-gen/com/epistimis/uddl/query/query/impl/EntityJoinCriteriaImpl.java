/**
 * generated by Xtext 2.32.0
 * Copyright (c) 2022, 2023 Epistimis LLC (http://www.epistimis.com).
 */
package com.epistimis.uddl.query.query.impl;

import com.epistimis.uddl.query.query.EntityJoinCriteria;
import com.epistimis.uddl.query.query.EntityTypeCharacteristicEquivalenceExpression;
import com.epistimis.uddl.query.query.QueryPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity Join Criteria</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.epistimis.uddl.query.query.impl.EntityJoinCriteriaImpl#getEtcee <em>Etcee</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EntityJoinCriteriaImpl extends MinimalEObjectImpl.Container implements EntityJoinCriteria
{
  /**
   * The cached value of the '{@link #getEtcee() <em>Etcee</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEtcee()
   * @generated
   * @ordered
   */
  protected EList<EntityTypeCharacteristicEquivalenceExpression> etcee;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EntityJoinCriteriaImpl()
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
    return QueryPackage.Literals.ENTITY_JOIN_CRITERIA;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<EntityTypeCharacteristicEquivalenceExpression> getEtcee()
  {
    if (etcee == null)
    {
      etcee = new EObjectContainmentEList<EntityTypeCharacteristicEquivalenceExpression>(EntityTypeCharacteristicEquivalenceExpression.class, this, QueryPackage.ENTITY_JOIN_CRITERIA__ETCEE);
    }
    return etcee;
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
      case QueryPackage.ENTITY_JOIN_CRITERIA__ETCEE:
        return ((InternalEList<?>)getEtcee()).basicRemove(otherEnd, msgs);
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
      case QueryPackage.ENTITY_JOIN_CRITERIA__ETCEE:
        return getEtcee();
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
      case QueryPackage.ENTITY_JOIN_CRITERIA__ETCEE:
        getEtcee().clear();
        getEtcee().addAll((Collection<? extends EntityTypeCharacteristicEquivalenceExpression>)newValue);
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
      case QueryPackage.ENTITY_JOIN_CRITERIA__ETCEE:
        getEtcee().clear();
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
      case QueryPackage.ENTITY_JOIN_CRITERIA__ETCEE:
        return etcee != null && !etcee.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //EntityJoinCriteriaImpl
