/**
 */
package fr.unice.polytech.alexisc.smarthomedsl.model.model.impl;

import fr.unice.polytech.alexisc.smarthomedsl.model.model.ModelPackage;
import fr.unice.polytech.alexisc.smarthomedsl.model.model.Person;
import fr.unice.polytech.alexisc.smarthomedsl.model.model.Tag;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.unice.polytech.alexisc.smarthomedsl.model.model.impl.PersonImpl#getBelt <em>Belt</em>}</li>
 *   <li>{@link fr.unice.polytech.alexisc.smarthomedsl.model.model.impl.PersonImpl#getLeftAnkle <em>Left Ankle</em>}</li>
 *   <li>{@link fr.unice.polytech.alexisc.smarthomedsl.model.model.impl.PersonImpl#getRightAnkle <em>Right Ankle</em>}</li>
 *   <li>{@link fr.unice.polytech.alexisc.smarthomedsl.model.model.impl.PersonImpl#getChest <em>Chest</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PersonImpl extends NamedEntityImpl implements Person {
	/**
	 * The cached value of the '{@link #getBelt() <em>Belt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBelt()
	 * @generated
	 * @ordered
	 */
	protected Tag belt;

	/**
	 * The cached value of the '{@link #getLeftAnkle() <em>Left Ankle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeftAnkle()
	 * @generated
	 * @ordered
	 */
	protected Tag leftAnkle;

	/**
	 * The cached value of the '{@link #getRightAnkle() <em>Right Ankle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightAnkle()
	 * @generated
	 * @ordered
	 */
	protected Tag rightAnkle;

	/**
	 * The cached value of the '{@link #getChest() <em>Chest</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChest()
	 * @generated
	 * @ordered
	 */
	protected Tag chest;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.PERSON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tag getBelt() {
		return belt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBelt(Tag newBelt, NotificationChain msgs) {
		Tag oldBelt = belt;
		belt = newBelt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.PERSON__BELT, oldBelt, newBelt);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBelt(Tag newBelt) {
		if (newBelt != belt) {
			NotificationChain msgs = null;
			if (belt != null)
				msgs = ((InternalEObject)belt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.PERSON__BELT, null, msgs);
			if (newBelt != null)
				msgs = ((InternalEObject)newBelt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.PERSON__BELT, null, msgs);
			msgs = basicSetBelt(newBelt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PERSON__BELT, newBelt, newBelt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tag getLeftAnkle() {
		return leftAnkle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLeftAnkle(Tag newLeftAnkle, NotificationChain msgs) {
		Tag oldLeftAnkle = leftAnkle;
		leftAnkle = newLeftAnkle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.PERSON__LEFT_ANKLE, oldLeftAnkle, newLeftAnkle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeftAnkle(Tag newLeftAnkle) {
		if (newLeftAnkle != leftAnkle) {
			NotificationChain msgs = null;
			if (leftAnkle != null)
				msgs = ((InternalEObject)leftAnkle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.PERSON__LEFT_ANKLE, null, msgs);
			if (newLeftAnkle != null)
				msgs = ((InternalEObject)newLeftAnkle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.PERSON__LEFT_ANKLE, null, msgs);
			msgs = basicSetLeftAnkle(newLeftAnkle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PERSON__LEFT_ANKLE, newLeftAnkle, newLeftAnkle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tag getRightAnkle() {
		return rightAnkle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRightAnkle(Tag newRightAnkle, NotificationChain msgs) {
		Tag oldRightAnkle = rightAnkle;
		rightAnkle = newRightAnkle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.PERSON__RIGHT_ANKLE, oldRightAnkle, newRightAnkle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRightAnkle(Tag newRightAnkle) {
		if (newRightAnkle != rightAnkle) {
			NotificationChain msgs = null;
			if (rightAnkle != null)
				msgs = ((InternalEObject)rightAnkle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.PERSON__RIGHT_ANKLE, null, msgs);
			if (newRightAnkle != null)
				msgs = ((InternalEObject)newRightAnkle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.PERSON__RIGHT_ANKLE, null, msgs);
			msgs = basicSetRightAnkle(newRightAnkle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PERSON__RIGHT_ANKLE, newRightAnkle, newRightAnkle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tag getChest() {
		return chest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChest(Tag newChest, NotificationChain msgs) {
		Tag oldChest = chest;
		chest = newChest;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.PERSON__CHEST, oldChest, newChest);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChest(Tag newChest) {
		if (newChest != chest) {
			NotificationChain msgs = null;
			if (chest != null)
				msgs = ((InternalEObject)chest).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.PERSON__CHEST, null, msgs);
			if (newChest != null)
				msgs = ((InternalEObject)newChest).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.PERSON__CHEST, null, msgs);
			msgs = basicSetChest(newChest, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PERSON__CHEST, newChest, newChest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.PERSON__BELT:
				return basicSetBelt(null, msgs);
			case ModelPackage.PERSON__LEFT_ANKLE:
				return basicSetLeftAnkle(null, msgs);
			case ModelPackage.PERSON__RIGHT_ANKLE:
				return basicSetRightAnkle(null, msgs);
			case ModelPackage.PERSON__CHEST:
				return basicSetChest(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.PERSON__BELT:
				return getBelt();
			case ModelPackage.PERSON__LEFT_ANKLE:
				return getLeftAnkle();
			case ModelPackage.PERSON__RIGHT_ANKLE:
				return getRightAnkle();
			case ModelPackage.PERSON__CHEST:
				return getChest();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ModelPackage.PERSON__BELT:
				setBelt((Tag)newValue);
				return;
			case ModelPackage.PERSON__LEFT_ANKLE:
				setLeftAnkle((Tag)newValue);
				return;
			case ModelPackage.PERSON__RIGHT_ANKLE:
				setRightAnkle((Tag)newValue);
				return;
			case ModelPackage.PERSON__CHEST:
				setChest((Tag)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case ModelPackage.PERSON__BELT:
				setBelt((Tag)null);
				return;
			case ModelPackage.PERSON__LEFT_ANKLE:
				setLeftAnkle((Tag)null);
				return;
			case ModelPackage.PERSON__RIGHT_ANKLE:
				setRightAnkle((Tag)null);
				return;
			case ModelPackage.PERSON__CHEST:
				setChest((Tag)null);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ModelPackage.PERSON__BELT:
				return belt != null;
			case ModelPackage.PERSON__LEFT_ANKLE:
				return leftAnkle != null;
			case ModelPackage.PERSON__RIGHT_ANKLE:
				return rightAnkle != null;
			case ModelPackage.PERSON__CHEST:
				return chest != null;
		}
		return super.eIsSet(featureID);
	}

} //PersonImpl
