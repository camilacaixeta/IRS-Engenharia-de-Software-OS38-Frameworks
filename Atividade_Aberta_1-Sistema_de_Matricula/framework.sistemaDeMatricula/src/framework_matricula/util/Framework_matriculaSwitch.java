/**
 */
package framework_matricula.util;

import framework_matricula.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see framework_matricula.Framework_matriculaPackage
 * @generated
 */
public class Framework_matriculaSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Framework_matriculaPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Framework_matriculaSwitch() {
		if (modelPackage == null) {
			modelPackage = Framework_matriculaPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case Framework_matriculaPackage.DISCIPLINA: {
				Disciplina disciplina = (Disciplina)theEObject;
				T result = caseDisciplina(disciplina);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Framework_matriculaPackage.MATRICULA: {
				Matricula matricula = (Matricula)theEObject;
				T result = caseMatricula(matricula);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Framework_matriculaPackage.ALUNO: {
				Aluno aluno = (Aluno)theEObject;
				T result = caseAluno(aluno);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Framework_matriculaPackage.ALUNO_BOLSISTA: {
				AlunoBolsista alunoBolsista = (AlunoBolsista)theEObject;
				T result = caseAlunoBolsista(alunoBolsista);
				if (result == null) result = caseAluno(alunoBolsista);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Framework_matriculaPackage.ALUNO_COMUM: {
				AlunoComum alunoComum = (AlunoComum)theEObject;
				T result = caseAlunoComum(alunoComum);
				if (result == null) result = caseAluno(alunoComum);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Framework_matriculaPackage.TIPO_MATRICULA: {
				TipoMatricula tipoMatricula = (TipoMatricula)theEObject;
				T result = caseTipoMatricula(tipoMatricula);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Disciplina</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Disciplina</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDisciplina(Disciplina object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Matricula</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Matricula</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMatricula(Matricula object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aluno</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aluno</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAluno(Aluno object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aluno Bolsista</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aluno Bolsista</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAlunoBolsista(AlunoBolsista object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aluno Comum</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aluno Comum</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAlunoComum(AlunoComum object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tipo Matricula</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tipo Matricula</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTipoMatricula(TipoMatricula object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //Framework_matriculaSwitch
