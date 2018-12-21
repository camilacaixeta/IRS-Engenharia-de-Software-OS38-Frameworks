/**
 */
package framework_campeonato.impl;

import framework_campeonato.Campeonato;
import framework_campeonato.Framework_campeonatoPackage;
import framework_campeonato.Grupo;
import framework_campeonato.TipoCampeonato;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

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
 * An implementation of the model object '<em><b>Campeonato</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link framework_campeonato.impl.CampeonatoImpl#getNome <em>Nome</em>}</li>
 *   <li>{@link framework_campeonato.impl.CampeonatoImpl#getDataInicial <em>Data Inicial</em>}</li>
 *   <li>{@link framework_campeonato.impl.CampeonatoImpl#getDataFinal <em>Data Final</em>}</li>
 *   <li>{@link framework_campeonato.impl.CampeonatoImpl#getTipoCampeonato <em>Tipo Campeonato</em>}</li>
 *   <li>{@link framework_campeonato.impl.CampeonatoImpl#getGrupo <em>Grupo</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CampeonatoImpl extends MinimalEObjectImpl.Container implements Campeonato {
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
	 * The default value of the '{@link #getDataInicial() <em>Data Inicial</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataInicial()
	 * @generated
	 * @ordered
	 */
	protected static final String DATA_INICIAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDataInicial() <em>Data Inicial</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataInicial()
	 * @generated
	 * @ordered
	 */
	protected String dataInicial = DATA_INICIAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getDataFinal() <em>Data Final</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataFinal()
	 * @generated
	 * @ordered
	 */
	protected static final String DATA_FINAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDataFinal() <em>Data Final</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataFinal()
	 * @generated
	 * @ordered
	 */
	protected String dataFinal = DATA_FINAL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTipoCampeonato() <em>Tipo Campeonato</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipoCampeonato()
	 * @generated
	 * @ordered
	 */
	protected TipoCampeonato tipoCampeonato;

	/**
	 * The cached value of the '{@link #getGrupo() <em>Grupo</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrupo()
	 * @generated
	 * @ordered
	 */
	protected List<Grupo> grupo = new ArrayList<>();
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CampeonatoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Framework_campeonatoPackage.Literals.CAMPEONATO;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Framework_campeonatoPackage.CAMPEONATO__NOME, oldNome, nome));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDataInicial() {
		return dataInicial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataInicial(String newDataInicial) {
		String oldDataInicial = dataInicial;
		dataInicial = newDataInicial;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Framework_campeonatoPackage.CAMPEONATO__DATA_INICIAL, oldDataInicial, dataInicial));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDataFinal() {
		return dataFinal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataFinal(String newDataFinal) {
		String oldDataFinal = dataFinal;
		dataFinal = newDataFinal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Framework_campeonatoPackage.CAMPEONATO__DATA_FINAL, oldDataFinal, dataFinal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TipoCampeonato getTipoCampeonato() {
		return tipoCampeonato;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTipoCampeonato(TipoCampeonato newTipoCampeonato, NotificationChain msgs) {
		TipoCampeonato oldTipoCampeonato = tipoCampeonato;
		tipoCampeonato = newTipoCampeonato;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Framework_campeonatoPackage.CAMPEONATO__TIPO_CAMPEONATO, oldTipoCampeonato, newTipoCampeonato);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTipoCampeonato(TipoCampeonato newTipoCampeonato) {
		if (newTipoCampeonato != tipoCampeonato) {
			NotificationChain msgs = null;
			if (tipoCampeonato != null)
				msgs = ((InternalEObject)tipoCampeonato).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Framework_campeonatoPackage.CAMPEONATO__TIPO_CAMPEONATO, null, msgs);
			if (newTipoCampeonato != null)
				msgs = ((InternalEObject)newTipoCampeonato).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Framework_campeonatoPackage.CAMPEONATO__TIPO_CAMPEONATO, null, msgs);
			msgs = basicSetTipoCampeonato(newTipoCampeonato, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Framework_campeonatoPackage.CAMPEONATO__TIPO_CAMPEONATO, newTipoCampeonato, newTipoCampeonato));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<Grupo> getGrupo() {
		if (grupo == null) {
			grupo = new EObjectContainmentEList<Grupo>(Grupo.class, this, Framework_campeonatoPackage.CAMPEONATO__GRUPO);
		}
		return grupo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void decidirFinalistas() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void decidirMVP() {
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
			case Framework_campeonatoPackage.CAMPEONATO__TIPO_CAMPEONATO:
				return basicSetTipoCampeonato(null, msgs);
			case Framework_campeonatoPackage.CAMPEONATO__GRUPO:
				return ((InternalEList<?>)getGrupo()).basicRemove(otherEnd, msgs);
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
			case Framework_campeonatoPackage.CAMPEONATO__NOME:
				return getNome();
			case Framework_campeonatoPackage.CAMPEONATO__DATA_INICIAL:
				return getDataInicial();
			case Framework_campeonatoPackage.CAMPEONATO__DATA_FINAL:
				return getDataFinal();
			case Framework_campeonatoPackage.CAMPEONATO__TIPO_CAMPEONATO:
				return getTipoCampeonato();
			case Framework_campeonatoPackage.CAMPEONATO__GRUPO:
				return getGrupo();
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
			case Framework_campeonatoPackage.CAMPEONATO__NOME:
				setNome((String)newValue);
				return;
			case Framework_campeonatoPackage.CAMPEONATO__DATA_INICIAL:
				setDataInicial((String)newValue);
				return;
			case Framework_campeonatoPackage.CAMPEONATO__DATA_FINAL:
				setDataFinal((String)newValue);
				return;
			case Framework_campeonatoPackage.CAMPEONATO__TIPO_CAMPEONATO:
				setTipoCampeonato((TipoCampeonato)newValue);
				return;
			case Framework_campeonatoPackage.CAMPEONATO__GRUPO:
				getGrupo().clear();
				getGrupo().addAll((Collection<? extends Grupo>)newValue);
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
			case Framework_campeonatoPackage.CAMPEONATO__NOME:
				setNome(NOME_EDEFAULT);
				return;
			case Framework_campeonatoPackage.CAMPEONATO__DATA_INICIAL:
				setDataInicial(DATA_INICIAL_EDEFAULT);
				return;
			case Framework_campeonatoPackage.CAMPEONATO__DATA_FINAL:
				setDataFinal(DATA_FINAL_EDEFAULT);
				return;
			case Framework_campeonatoPackage.CAMPEONATO__TIPO_CAMPEONATO:
				setTipoCampeonato((TipoCampeonato)null);
				return;
			case Framework_campeonatoPackage.CAMPEONATO__GRUPO:
				getGrupo().clear();
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
			case Framework_campeonatoPackage.CAMPEONATO__NOME:
				return NOME_EDEFAULT == null ? nome != null : !NOME_EDEFAULT.equals(nome);
			case Framework_campeonatoPackage.CAMPEONATO__DATA_INICIAL:
				return DATA_INICIAL_EDEFAULT == null ? dataInicial != null : !DATA_INICIAL_EDEFAULT.equals(dataInicial);
			case Framework_campeonatoPackage.CAMPEONATO__DATA_FINAL:
				return DATA_FINAL_EDEFAULT == null ? dataFinal != null : !DATA_FINAL_EDEFAULT.equals(dataFinal);
			case Framework_campeonatoPackage.CAMPEONATO__TIPO_CAMPEONATO:
				return tipoCampeonato != null;
			case Framework_campeonatoPackage.CAMPEONATO__GRUPO:
				return grupo != null && !grupo.isEmpty();
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
			case Framework_campeonatoPackage.CAMPEONATO___DECIDIR_FINALISTAS:
				decidirFinalistas();
				return null;
			case Framework_campeonatoPackage.CAMPEONATO___DECIDIR_MVP:
				decidirMVP();
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
		result.append(", dataInicial: ");
		result.append(dataInicial);
		result.append(", dataFinal: ");
		result.append(dataFinal);
		result.append(')');
		return result.toString();
	}

} //CampeonatoImpl
