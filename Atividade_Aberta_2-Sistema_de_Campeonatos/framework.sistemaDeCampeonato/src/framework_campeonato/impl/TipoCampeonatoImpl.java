/**
 */
package framework_campeonato.impl;

import framework_campeonato.Framework_campeonatoPackage;
import framework_campeonato.TipoCampeonato;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tipo Campeonato</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link framework_campeonato.impl.TipoCampeonatoImpl#getPONTOS_CORRIDOS <em>PONTOS CORRIDOS</em>}</li>
 *   <li>{@link framework_campeonato.impl.TipoCampeonatoImpl#getMATA_MATA <em>MATA MATA</em>}</li>
 *   <li>{@link framework_campeonato.impl.TipoCampeonatoImpl#getHIBRIDO <em>HIBRIDO</em>}</li>
 *   <li>{@link framework_campeonato.impl.TipoCampeonatoImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TipoCampeonatoImpl extends MinimalEObjectImpl.Container implements TipoCampeonato {
	/**
	 * The default value of the '{@link #getPONTOS_CORRIDOS() <em>PONTOS CORRIDOS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPONTOS_CORRIDOS()
	 * @generated
	 * @ordered
	 */
	protected static final String PONTOS_CORRIDOS_EDEFAULT = "Pontos Corridos";

	/**
	 * The cached value of the '{@link #getPONTOS_CORRIDOS() <em>PONTOS CORRIDOS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPONTOS_CORRIDOS()
	 * @generated
	 * @ordered
	 */
	protected String pontoS_CORRIDOS = PONTOS_CORRIDOS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMATA_MATA() <em>MATA MATA</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMATA_MATA()
	 * @generated
	 * @ordered
	 */
	protected static final String MATA_MATA_EDEFAULT = "Mata-mata";

	/**
	 * The cached value of the '{@link #getMATA_MATA() <em>MATA MATA</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMATA_MATA()
	 * @generated
	 * @ordered
	 */
	protected String matA_MATA = MATA_MATA_EDEFAULT;

	/**
	 * The default value of the '{@link #getHIBRIDO() <em>HIBRIDO</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHIBRIDO()
	 * @generated
	 * @ordered
	 */
	protected static final String HIBRIDO_EDEFAULT = "H\u00edbrido";

	/**
	 * The cached value of the '{@link #getHIBRIDO() <em>HIBRIDO</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHIBRIDO()
	 * @generated
	 * @ordered
	 */
	protected String hibrido = HIBRIDO_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TipoCampeonatoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Framework_campeonatoPackage.Literals.TIPO_CAMPEONATO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPONTOS_CORRIDOS() {
		return pontoS_CORRIDOS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPONTOS_CORRIDOS(String newPONTOS_CORRIDOS) {
		String oldPONTOS_CORRIDOS = pontoS_CORRIDOS;
		pontoS_CORRIDOS = newPONTOS_CORRIDOS;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Framework_campeonatoPackage.TIPO_CAMPEONATO__PONTOS_CORRIDOS, oldPONTOS_CORRIDOS, pontoS_CORRIDOS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMATA_MATA() {
		return matA_MATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMATA_MATA(String newMATA_MATA) {
		String oldMATA_MATA = matA_MATA;
		matA_MATA = newMATA_MATA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Framework_campeonatoPackage.TIPO_CAMPEONATO__MATA_MATA, oldMATA_MATA, matA_MATA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHIBRIDO() {
		return hibrido;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHIBRIDO(String newHIBRIDO) {
		String oldHIBRIDO = hibrido;
		hibrido = newHIBRIDO;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Framework_campeonatoPackage.TIPO_CAMPEONATO__HIBRIDO, oldHIBRIDO, hibrido));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Framework_campeonatoPackage.TIPO_CAMPEONATO__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Framework_campeonatoPackage.TIPO_CAMPEONATO__PONTOS_CORRIDOS:
				return getPONTOS_CORRIDOS();
			case Framework_campeonatoPackage.TIPO_CAMPEONATO__MATA_MATA:
				return getMATA_MATA();
			case Framework_campeonatoPackage.TIPO_CAMPEONATO__HIBRIDO:
				return getHIBRIDO();
			case Framework_campeonatoPackage.TIPO_CAMPEONATO__VALUE:
				return getValue();
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
			case Framework_campeonatoPackage.TIPO_CAMPEONATO__PONTOS_CORRIDOS:
				setPONTOS_CORRIDOS((String)newValue);
				return;
			case Framework_campeonatoPackage.TIPO_CAMPEONATO__MATA_MATA:
				setMATA_MATA((String)newValue);
				return;
			case Framework_campeonatoPackage.TIPO_CAMPEONATO__HIBRIDO:
				setHIBRIDO((String)newValue);
				return;
			case Framework_campeonatoPackage.TIPO_CAMPEONATO__VALUE:
				setValue((String)newValue);
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
			case Framework_campeonatoPackage.TIPO_CAMPEONATO__PONTOS_CORRIDOS:
				setPONTOS_CORRIDOS(PONTOS_CORRIDOS_EDEFAULT);
				return;
			case Framework_campeonatoPackage.TIPO_CAMPEONATO__MATA_MATA:
				setMATA_MATA(MATA_MATA_EDEFAULT);
				return;
			case Framework_campeonatoPackage.TIPO_CAMPEONATO__HIBRIDO:
				setHIBRIDO(HIBRIDO_EDEFAULT);
				return;
			case Framework_campeonatoPackage.TIPO_CAMPEONATO__VALUE:
				setValue(VALUE_EDEFAULT);
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
			case Framework_campeonatoPackage.TIPO_CAMPEONATO__PONTOS_CORRIDOS:
				return PONTOS_CORRIDOS_EDEFAULT == null ? pontoS_CORRIDOS != null : !PONTOS_CORRIDOS_EDEFAULT.equals(pontoS_CORRIDOS);
			case Framework_campeonatoPackage.TIPO_CAMPEONATO__MATA_MATA:
				return MATA_MATA_EDEFAULT == null ? matA_MATA != null : !MATA_MATA_EDEFAULT.equals(matA_MATA);
			case Framework_campeonatoPackage.TIPO_CAMPEONATO__HIBRIDO:
				return HIBRIDO_EDEFAULT == null ? hibrido != null : !HIBRIDO_EDEFAULT.equals(hibrido);
			case Framework_campeonatoPackage.TIPO_CAMPEONATO__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
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
		result.append(" (PONTOS_CORRIDOS: ");
		result.append(pontoS_CORRIDOS);
		result.append(", MATA_MATA: ");
		result.append(matA_MATA);
		result.append(", HIBRIDO: ");
		result.append(hibrido);
		result.append(", value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

} //TipoCampeonatoImpl
