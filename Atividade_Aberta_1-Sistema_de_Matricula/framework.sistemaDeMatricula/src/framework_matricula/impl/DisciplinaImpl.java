/**
 */
package framework_matricula.impl;

import framework_matricula.Disciplina;
import framework_matricula.Framework_matriculaPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Disciplina</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link framework_matricula.impl.DisciplinaImpl#getNome <em>Nome</em>}</li>
 *   <li>{@link framework_matricula.impl.DisciplinaImpl#getCodigo <em>Codigo</em>}</li>
 *   <li>{@link framework_matricula.impl.DisciplinaImpl#getAreaConhecimento <em>Area Conhecimento</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DisciplinaImpl extends MinimalEObjectImpl.Container implements Disciplina {
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
	protected static final Integer CODIGO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCodigo() <em>Codigo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodigo()
	 * @generated
	 * @ordered
	 */
	protected Integer codigo = CODIGO_EDEFAULT;

	/**
	 * The default value of the '{@link #getAreaConhecimento() <em>Area Conhecimento</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAreaConhecimento()
	 * @generated
	 * @ordered
	 */
	protected static final String AREA_CONHECIMENTO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAreaConhecimento() <em>Area Conhecimento</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAreaConhecimento()
	 * @generated
	 * @ordered
	 */
	protected String areaConhecimento = AREA_CONHECIMENTO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DisciplinaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Framework_matriculaPackage.Literals.DISCIPLINA;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Framework_matriculaPackage.DISCIPLINA__NOME, oldNome, nome));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getCodigo() {
		return codigo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodigo(Integer newCodigo) {
		Integer oldCodigo = codigo;
		codigo = newCodigo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Framework_matriculaPackage.DISCIPLINA__CODIGO, oldCodigo, codigo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAreaConhecimento() {
		return areaConhecimento;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAreaConhecimento(String newAreaConhecimento) {
		String oldAreaConhecimento = areaConhecimento;
		areaConhecimento = newAreaConhecimento;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Framework_matriculaPackage.DISCIPLINA__AREA_CONHECIMENTO, oldAreaConhecimento, areaConhecimento));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Framework_matriculaPackage.DISCIPLINA__NOME:
				return getNome();
			case Framework_matriculaPackage.DISCIPLINA__CODIGO:
				return getCodigo();
			case Framework_matriculaPackage.DISCIPLINA__AREA_CONHECIMENTO:
				return getAreaConhecimento();
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
			case Framework_matriculaPackage.DISCIPLINA__NOME:
				setNome((String)newValue);
				return;
			case Framework_matriculaPackage.DISCIPLINA__CODIGO:
				setCodigo((Integer)newValue);
				return;
			case Framework_matriculaPackage.DISCIPLINA__AREA_CONHECIMENTO:
				setAreaConhecimento((String)newValue);
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
			case Framework_matriculaPackage.DISCIPLINA__NOME:
				setNome(NOME_EDEFAULT);
				return;
			case Framework_matriculaPackage.DISCIPLINA__CODIGO:
				setCodigo(CODIGO_EDEFAULT);
				return;
			case Framework_matriculaPackage.DISCIPLINA__AREA_CONHECIMENTO:
				setAreaConhecimento(AREA_CONHECIMENTO_EDEFAULT);
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
			case Framework_matriculaPackage.DISCIPLINA__NOME:
				return NOME_EDEFAULT == null ? nome != null : !NOME_EDEFAULT.equals(nome);
			case Framework_matriculaPackage.DISCIPLINA__CODIGO:
				return CODIGO_EDEFAULT == null ? codigo != null : !CODIGO_EDEFAULT.equals(codigo);
			case Framework_matriculaPackage.DISCIPLINA__AREA_CONHECIMENTO:
				return AREA_CONHECIMENTO_EDEFAULT == null ? areaConhecimento != null : !AREA_CONHECIMENTO_EDEFAULT.equals(areaConhecimento);
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
		result.append(", codigo: ");
		result.append(codigo);
		result.append(", areaConhecimento: ");
		result.append(areaConhecimento);
		result.append(')');
		return result.toString();
	}

} //DisciplinaImpl
