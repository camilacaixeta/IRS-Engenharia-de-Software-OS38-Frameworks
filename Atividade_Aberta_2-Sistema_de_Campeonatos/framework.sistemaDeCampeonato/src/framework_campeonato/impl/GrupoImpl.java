/**
 */
package framework_campeonato.impl;

import framework_campeonato.Framework_campeonatoPackage;
import framework_campeonato.Grupo;
import framework_campeonato.Time;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Grupo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link framework_campeonato.impl.GrupoImpl#getNome <em>Nome</em>}</li>
 *   <li>{@link framework_campeonato.impl.GrupoImpl#getCodigo <em>Codigo</em>}</li>
 *   <li>{@link framework_campeonato.impl.GrupoImpl#getTime <em>Time</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GrupoImpl extends MinimalEObjectImpl.Container implements Grupo {
	/**
	 * The default value of the '{@link #getNome() <em>Nome</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNome()
	 * @generated
	 * @ordered
	 */
	protected static final String NOME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNome() <em>Nome</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNome()
	 * @generated
	 * @ordered
	 */
	protected String nome = NOME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCodigo() <em>Codigo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodigo()
	 * @generated
	 * @ordered
	 */
	protected static final String CODIGO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCodigo() <em>Codigo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodigo()
	 * @generated
	 * @ordered
	 */
	protected String codigo = CODIGO_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTime() <em>Time</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected EList<Time> time;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GrupoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Framework_campeonatoPackage.Literals.GRUPO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNome(String newNome) {
		String oldNome = nome;
		nome = newNome;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Framework_campeonatoPackage.GRUPO__NOME, oldNome, nome));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCodigo() {
		return codigo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodigo(String newCodigo) {
		String oldCodigo = codigo;
		codigo = newCodigo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Framework_campeonatoPackage.GRUPO__CODIGO, oldCodigo, codigo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Time> getTime() {
		if (time == null) {
			time = new EObjectContainmentEList<Time>(Time.class, this, Framework_campeonatoPackage.GRUPO__TIME);
		}
		return time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void partida() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Framework_campeonatoPackage.GRUPO__TIME:
				return ((InternalEList<?>)getTime()).basicRemove(otherEnd, msgs);
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
			case Framework_campeonatoPackage.GRUPO__NOME:
				return getNome();
			case Framework_campeonatoPackage.GRUPO__CODIGO:
				return getCodigo();
			case Framework_campeonatoPackage.GRUPO__TIME:
				return getTime();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Framework_campeonatoPackage.GRUPO__NOME:
				setNome((String)newValue);
				return;
			case Framework_campeonatoPackage.GRUPO__CODIGO:
				setCodigo((String)newValue);
				return;
			case Framework_campeonatoPackage.GRUPO__TIME:
				getTime().clear();
				getTime().addAll((Collection<? extends Time>)newValue);
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
			case Framework_campeonatoPackage.GRUPO__NOME:
				setNome(NOME_EDEFAULT);
				return;
			case Framework_campeonatoPackage.GRUPO__CODIGO:
				setCodigo(CODIGO_EDEFAULT);
				return;
			case Framework_campeonatoPackage.GRUPO__TIME:
				getTime().clear();
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
			case Framework_campeonatoPackage.GRUPO__NOME:
				return NOME_EDEFAULT == null ? nome != null : !NOME_EDEFAULT.equals(nome);
			case Framework_campeonatoPackage.GRUPO__CODIGO:
				return CODIGO_EDEFAULT == null ? codigo != null : !CODIGO_EDEFAULT.equals(codigo);
			case Framework_campeonatoPackage.GRUPO__TIME:
				return time != null && !time.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case Framework_campeonatoPackage.GRUPO___PARTIDA:
				partida();
				return null;
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (nome: ");
		result.append(nome);
		result.append(", codigo: ");
		result.append(codigo);
		result.append(')');
		return result.toString();
	}

} //GrupoImpl
