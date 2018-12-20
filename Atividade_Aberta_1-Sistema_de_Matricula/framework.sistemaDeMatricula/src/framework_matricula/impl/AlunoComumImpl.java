/**
 */
package framework_matricula.impl;

import framework_matricula.AlunoComum;
import framework_matricula.Framework_matriculaPackage;
import framework_matricula.Matricula;

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
 * An implementation of the model object '<em><b>Aluno Comum</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link framework_matricula.impl.AlunoComumImpl#getNome <em>Nome</em>}</li>
 *   <li>{@link framework_matricula.impl.AlunoComumImpl#getNumeroMatricula <em>Numero Matricula</em>}</li>
 *   <li>{@link framework_matricula.impl.AlunoComumImpl#getDataNascimento <em>Data Nascimento</em>}</li>
 *   <li>{@link framework_matricula.impl.AlunoComumImpl#getMatricula <em>Matricula</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AlunoComumImpl extends MinimalEObjectImpl.Container implements AlunoComum {
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
	 * The default value of the '{@link #getNumeroMatricula() <em>Numero Matricula</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumeroMatricula()
	 * @generated
	 * @ordered
	 */
	protected static final Integer NUMERO_MATRICULA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumeroMatricula() <em>Numero Matricula</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumeroMatricula()
	 * @generated
	 * @ordered
	 */
	protected Integer numeroMatricula = NUMERO_MATRICULA_EDEFAULT;

	/**
	 * The default value of the '{@link #getDataNascimento() <em>Data Nascimento</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataNascimento()
	 * @generated
	 * @ordered
	 */
	protected static final String DATA_NASCIMENTO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDataNascimento() <em>Data Nascimento</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataNascimento()
	 * @generated
	 * @ordered
	 */
	protected String dataNascimento = DATA_NASCIMENTO_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMatricula() <em>Matricula</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatricula()
	 * @generated
	 * @ordered
	 */
	protected EList<Matricula> matricula;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AlunoComumImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Framework_matriculaPackage.Literals.ALUNO_COMUM;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Framework_matriculaPackage.ALUNO_COMUM__NOME, oldNome, nome));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getNumeroMatricula() {
		return numeroMatricula;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumeroMatricula(Integer newNumeroMatricula) {
		Integer oldNumeroMatricula = numeroMatricula;
		numeroMatricula = newNumeroMatricula;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Framework_matriculaPackage.ALUNO_COMUM__NUMERO_MATRICULA, oldNumeroMatricula, numeroMatricula));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDataNascimento() {
		return dataNascimento;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataNascimento(String newDataNascimento) {
		String oldDataNascimento = dataNascimento;
		dataNascimento = newDataNascimento;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Framework_matriculaPackage.ALUNO_COMUM__DATA_NASCIMENTO, oldDataNascimento, dataNascimento));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Matricula> getMatricula() {
		if (matricula == null) {
			matricula = new EObjectContainmentEList<Matricula>(Matricula.class, this, Framework_matriculaPackage.ALUNO_COMUM__MATRICULA);
		}
		return matricula;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Framework_matriculaPackage.ALUNO_COMUM__MATRICULA:
				return ((InternalEList<?>)getMatricula()).basicRemove(otherEnd, msgs);
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
			case Framework_matriculaPackage.ALUNO_COMUM__NOME:
				return getNome();
			case Framework_matriculaPackage.ALUNO_COMUM__NUMERO_MATRICULA:
				return getNumeroMatricula();
			case Framework_matriculaPackage.ALUNO_COMUM__DATA_NASCIMENTO:
				return getDataNascimento();
			case Framework_matriculaPackage.ALUNO_COMUM__MATRICULA:
				return getMatricula();
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
			case Framework_matriculaPackage.ALUNO_COMUM__NOME:
				setNome((String)newValue);
				return;
			case Framework_matriculaPackage.ALUNO_COMUM__NUMERO_MATRICULA:
				setNumeroMatricula((Integer)newValue);
				return;
			case Framework_matriculaPackage.ALUNO_COMUM__DATA_NASCIMENTO:
				setDataNascimento((String)newValue);
				return;
			case Framework_matriculaPackage.ALUNO_COMUM__MATRICULA:
				getMatricula().clear();
				getMatricula().addAll((Collection<? extends Matricula>)newValue);
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
			case Framework_matriculaPackage.ALUNO_COMUM__NOME:
				setNome(NOME_EDEFAULT);
				return;
			case Framework_matriculaPackage.ALUNO_COMUM__NUMERO_MATRICULA:
				setNumeroMatricula(NUMERO_MATRICULA_EDEFAULT);
				return;
			case Framework_matriculaPackage.ALUNO_COMUM__DATA_NASCIMENTO:
				setDataNascimento(DATA_NASCIMENTO_EDEFAULT);
				return;
			case Framework_matriculaPackage.ALUNO_COMUM__MATRICULA:
				getMatricula().clear();
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
			case Framework_matriculaPackage.ALUNO_COMUM__NOME:
				return NOME_EDEFAULT == null ? nome != null : !NOME_EDEFAULT.equals(nome);
			case Framework_matriculaPackage.ALUNO_COMUM__NUMERO_MATRICULA:
				return NUMERO_MATRICULA_EDEFAULT == null ? numeroMatricula != null : !NUMERO_MATRICULA_EDEFAULT.equals(numeroMatricula);
			case Framework_matriculaPackage.ALUNO_COMUM__DATA_NASCIMENTO:
				return DATA_NASCIMENTO_EDEFAULT == null ? dataNascimento != null : !DATA_NASCIMENTO_EDEFAULT.equals(dataNascimento);
			case Framework_matriculaPackage.ALUNO_COMUM__MATRICULA:
				return matricula != null && !matricula.isEmpty();
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
		result.append(" (nome: ");
		result.append(nome);
		result.append(", numeroMatricula: ");
		result.append(numeroMatricula);
		result.append(", dataNascimento: ");
		result.append(dataNascimento);
		result.append(')');
		return result.toString();
	}

} //AlunoComumImpl
