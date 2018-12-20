/**
 */
package framework_matricula.impl;

import framework_matricula.Framework_matriculaPackage;
import framework_matricula.TipoMatricula;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tipo Matricula</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link framework_matricula.impl.TipoMatriculaImpl#getValue <em>Value</em>}</li>
 *   <li>{@link framework_matricula.impl.TipoMatriculaImpl#getPRESENCIAL <em>PRESENCIAL</em>}</li>
 *   <li>{@link framework_matricula.impl.TipoMatriculaImpl#getVIRTUAL <em>VIRTUAL</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TipoMatriculaImpl extends MinimalEObjectImpl.Container implements TipoMatricula {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPRESENCIAL() <em>PRESENCIAL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPRESENCIAL()
	 * @generated
	 * @ordered
	 */
	protected static final String PRESENCIAL_EDEFAULT = "Presencial";

	/**
	 * The cached value of the '{@link #getPRESENCIAL() <em>PRESENCIAL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPRESENCIAL()
	 * @generated
	 * @ordered
	 */
	protected String presencial = PRESENCIAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getVIRTUAL() <em>VIRTUAL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVIRTUAL()
	 * @generated
	 * @ordered
	 */
	protected static final String VIRTUAL_EDEFAULT = "Virtual";

	/**
	 * The cached value of the '{@link #getVIRTUAL() <em>VIRTUAL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVIRTUAL()
	 * @generated
	 * @ordered
	 */
	protected String virtual = VIRTUAL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TipoMatriculaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Framework_matriculaPackage.Literals.TIPO_MATRICULA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Framework_matriculaPackage.TIPO_MATRICULA__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPRESENCIAL() {
		return presencial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPRESENCIAL(String newPRESENCIAL) {
		String oldPRESENCIAL = presencial;
		presencial = newPRESENCIAL;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Framework_matriculaPackage.TIPO_MATRICULA__PRESENCIAL, oldPRESENCIAL, presencial));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVIRTUAL() {
		return virtual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVIRTUAL(String newVIRTUAL) {
		String oldVIRTUAL = virtual;
		virtual = newVIRTUAL;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Framework_matriculaPackage.TIPO_MATRICULA__VIRTUAL, oldVIRTUAL, virtual));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Framework_matriculaPackage.TIPO_MATRICULA__VALUE:
				return getValue();
			case Framework_matriculaPackage.TIPO_MATRICULA__PRESENCIAL:
				return getPRESENCIAL();
			case Framework_matriculaPackage.TIPO_MATRICULA__VIRTUAL:
				return getVIRTUAL();
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
			case Framework_matriculaPackage.TIPO_MATRICULA__VALUE:
				setValue((String)newValue);
				return;
			case Framework_matriculaPackage.TIPO_MATRICULA__PRESENCIAL:
				setPRESENCIAL((String)newValue);
				return;
			case Framework_matriculaPackage.TIPO_MATRICULA__VIRTUAL:
				setVIRTUAL((String)newValue);
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
			case Framework_matriculaPackage.TIPO_MATRICULA__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case Framework_matriculaPackage.TIPO_MATRICULA__PRESENCIAL:
				setPRESENCIAL(PRESENCIAL_EDEFAULT);
				return;
			case Framework_matriculaPackage.TIPO_MATRICULA__VIRTUAL:
				setVIRTUAL(VIRTUAL_EDEFAULT);
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
			case Framework_matriculaPackage.TIPO_MATRICULA__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case Framework_matriculaPackage.TIPO_MATRICULA__PRESENCIAL:
				return PRESENCIAL_EDEFAULT == null ? presencial != null : !PRESENCIAL_EDEFAULT.equals(presencial);
			case Framework_matriculaPackage.TIPO_MATRICULA__VIRTUAL:
				return VIRTUAL_EDEFAULT == null ? virtual != null : !VIRTUAL_EDEFAULT.equals(virtual);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (value: ");
		result.append(value);
		result.append(", PRESENCIAL: ");
		result.append(presencial);
		result.append(", VIRTUAL: ");
		result.append(virtual);
		result.append(')');
		return result.toString();
	}

} //TipoMatriculaImpl
