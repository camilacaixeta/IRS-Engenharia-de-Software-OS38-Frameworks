/**
 */
package framework_matricula.impl;

import framework_matricula.Disciplina;
import framework_matricula.Framework_matriculaPackage;
import framework_matricula.Matricula;
import framework_matricula.TipoMatricula;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Matricula</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link framework_matricula.impl.MatriculaImpl#getCodigo <em>Codigo</em>}</li>
 *   <li>{@link framework_matricula.impl.MatriculaImpl#getDisciplina <em>Disciplina</em>}</li>
 *   <li>{@link framework_matricula.impl.MatriculaImpl#getTipoMatricula <em>Tipo Matricula</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MatriculaImpl extends MinimalEObjectImpl.Container implements Matricula {
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
	 * The cached value of the '{@link #getDisciplina() <em>Disciplina</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisciplina()
	 * @generated
	 * @ordered
	 */
	protected Disciplina disciplina;

	/**
	 * The cached value of the '{@link #getTipoMatricula() <em>Tipo Matricula</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipoMatricula()
	 * @generated
	 * @ordered
	 */
	protected TipoMatricula tipoMatricula;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MatriculaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Framework_matriculaPackage.Literals.MATRICULA;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Framework_matriculaPackage.MATRICULA__CODIGO, oldCodigo, codigo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Disciplina getDisciplina() {
		return disciplina;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDisciplina(Disciplina newDisciplina, NotificationChain msgs) {
		Disciplina oldDisciplina = disciplina;
		disciplina = newDisciplina;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Framework_matriculaPackage.MATRICULA__DISCIPLINA, oldDisciplina, newDisciplina);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisciplina(Disciplina newDisciplina) {
		if (newDisciplina != disciplina) {
			NotificationChain msgs = null;
			if (disciplina != null)
				msgs = ((InternalEObject)disciplina).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Framework_matriculaPackage.MATRICULA__DISCIPLINA, null, msgs);
			if (newDisciplina != null)
				msgs = ((InternalEObject)newDisciplina).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Framework_matriculaPackage.MATRICULA__DISCIPLINA, null, msgs);
			msgs = basicSetDisciplina(newDisciplina, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Framework_matriculaPackage.MATRICULA__DISCIPLINA, newDisciplina, newDisciplina));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TipoMatricula getTipoMatricula() {
		return tipoMatricula;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTipoMatricula(TipoMatricula newTipoMatricula, NotificationChain msgs) {
		TipoMatricula oldTipoMatricula = tipoMatricula;
		tipoMatricula = newTipoMatricula;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Framework_matriculaPackage.MATRICULA__TIPO_MATRICULA, oldTipoMatricula, newTipoMatricula);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTipoMatricula(TipoMatricula newTipoMatricula) {
		if (newTipoMatricula != tipoMatricula) {
			NotificationChain msgs = null;
			if (tipoMatricula != null)
				msgs = ((InternalEObject)tipoMatricula).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Framework_matriculaPackage.MATRICULA__TIPO_MATRICULA, null, msgs);
			if (newTipoMatricula != null)
				msgs = ((InternalEObject)newTipoMatricula).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Framework_matriculaPackage.MATRICULA__TIPO_MATRICULA, null, msgs);
			msgs = basicSetTipoMatricula(newTipoMatricula, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Framework_matriculaPackage.MATRICULA__TIPO_MATRICULA, newTipoMatricula, newTipoMatricula));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public void efetuarMatricula(String codigo, Disciplina disciplina, TipoMatricula tipoMatricula) {
		this.setCodigo(codigo);
		this.setDisciplina(disciplina);
		this.setTipoMatricula(tipoMatricula);
		System.out.println("::DEBUG:: Matrícula de código: " + codigo + " efetuada com sucesso!");
	}
	
	/**
	 * Método que trata TipoMatricula como enum - Seta valor de matrícula presencial
	 */
	public void efetuarMatriculaPresencial(String codigo, Disciplina disciplina){
		TipoMatricula tipo = Framework_matriculaFactoryImpl.init().createTipoMatricula();
		tipo.setValue(TipoMatriculaImpl.PRESENCIAL_EDEFAULT);
		efetuarMatricula(codigo, disciplina, tipo);
	}
	
	/**
	 * Método que trata TipoMatricula como enum - Seta valor de matrícula virtual
	 */
	public void efetuarMatriculaVirtual(String codigo, Disciplina disciplina){
		TipoMatricula tipo = Framework_matriculaFactoryImpl.init().createTipoMatricula();
		tipo.setValue(TipoMatriculaImpl.VIRTUAL_EDEFAULT);
		efetuarMatricula(codigo, disciplina, tipo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Framework_matriculaPackage.MATRICULA__DISCIPLINA:
				return basicSetDisciplina(null, msgs);
			case Framework_matriculaPackage.MATRICULA__TIPO_MATRICULA:
				return basicSetTipoMatricula(null, msgs);
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
			case Framework_matriculaPackage.MATRICULA__CODIGO:
				return getCodigo();
			case Framework_matriculaPackage.MATRICULA__DISCIPLINA:
				return getDisciplina();
			case Framework_matriculaPackage.MATRICULA__TIPO_MATRICULA:
				return getTipoMatricula();
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
			case Framework_matriculaPackage.MATRICULA__CODIGO:
				setCodigo((String)newValue);
				return;
			case Framework_matriculaPackage.MATRICULA__DISCIPLINA:
				setDisciplina((Disciplina)newValue);
				return;
			case Framework_matriculaPackage.MATRICULA__TIPO_MATRICULA:
				setTipoMatricula((TipoMatricula)newValue);
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
			case Framework_matriculaPackage.MATRICULA__CODIGO:
				setCodigo(CODIGO_EDEFAULT);
				return;
			case Framework_matriculaPackage.MATRICULA__DISCIPLINA:
				setDisciplina((Disciplina)null);
				return;
			case Framework_matriculaPackage.MATRICULA__TIPO_MATRICULA:
				setTipoMatricula((TipoMatricula)null);
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
			case Framework_matriculaPackage.MATRICULA__CODIGO:
				return CODIGO_EDEFAULT == null ? codigo != null : !CODIGO_EDEFAULT.equals(codigo);
			case Framework_matriculaPackage.MATRICULA__DISCIPLINA:
				return disciplina != null;
			case Framework_matriculaPackage.MATRICULA__TIPO_MATRICULA:
				return tipoMatricula != null;
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
			case Framework_matriculaPackage.MATRICULA___EFETUAR_MATRICULA__STRING_DISCIPLINA_TIPOMATRICULA:
				efetuarMatricula((String)arguments.get(0), (Disciplina)arguments.get(1), (TipoMatricula)arguments.get(2));
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
		result.append(" (codigo: ");
		result.append(codigo);
		result.append(')');
		return result.toString();
	}

} //MatriculaImpl
