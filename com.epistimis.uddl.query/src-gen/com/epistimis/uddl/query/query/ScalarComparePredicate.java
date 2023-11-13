/**
 * generated by Xtext 2.32.0
 * Copyright (c) 2022, 2023 Epistimis LLC (http://www.epistimis.com).
 */
package com.epistimis.uddl.query.query;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scalar Compare Predicate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.epistimis.uddl.query.query.ScalarComparePredicate#getLeft <em>Left</em>}</li>
 *   <li>{@link com.epistimis.uddl.query.query.ScalarComparePredicate#getOp <em>Op</em>}</li>
 *   <li>{@link com.epistimis.uddl.query.query.ScalarComparePredicate#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see com.epistimis.uddl.query.query.QueryPackage#getScalarComparePredicate()
 * @model
 * @generated
 */
public interface ScalarComparePredicate extends BooleanPredicate
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(PredicateTerm)
   * @see com.epistimis.uddl.query.query.QueryPackage#getScalarComparePredicate_Left()
   * @model containment="true"
   * @generated
   */
  PredicateTerm getLeft();

  /**
   * Sets the value of the '{@link com.epistimis.uddl.query.query.ScalarComparePredicate#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(PredicateTerm value);

  /**
   * Returns the value of the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op</em>' attribute.
   * @see #setOp(String)
   * @see com.epistimis.uddl.query.query.QueryPackage#getScalarComparePredicate_Op()
   * @model
   * @generated
   */
  String getOp();

  /**
   * Sets the value of the '{@link com.epistimis.uddl.query.query.ScalarComparePredicate#getOp <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op</em>' attribute.
   * @see #getOp()
   * @generated
   */
  void setOp(String value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(PredicateTerm)
   * @see com.epistimis.uddl.query.query.QueryPackage#getScalarComparePredicate_Right()
   * @model containment="true"
   * @generated
   */
  PredicateTerm getRight();

  /**
   * Sets the value of the '{@link com.epistimis.uddl.query.query.ScalarComparePredicate#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(PredicateTerm value);

} // ScalarComparePredicate
