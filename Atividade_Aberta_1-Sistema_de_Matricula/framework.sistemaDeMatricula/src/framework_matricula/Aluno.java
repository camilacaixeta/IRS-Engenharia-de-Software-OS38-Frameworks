/**
 */
package framework_matricula;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aluno</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link framework_matricula.Aluno#getNome <em>Nome</em>}</li>
 *   <li>{@link framework_matricula.Aluno#getNumeroMatricula <em>Numero Matricula</em>}</li>
 *   <li>{@link framework_matricula.Aluno#getDataNascimento <em>Data Nascimento</em>}</li>
 *   <li>{@link framework_matricula.Aluno#getMatricula <em>Matricula</em>}</li>
 * </ul>
 *
 * @see framework_matricula.Framework_matriculaPackage#getAluno()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Aluno extends EObject {
	/**
	 * Returns the value of the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nome</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nome</em>' attribute.
	 * @see #setNome(String)
	 * @see framework_matricula.Framework_matriculaPackage#getAluno_Nome()
	 * @model
	 * @generated
	 */
	String getNome();

	/**
	 * Sets the value of the '{@link framework_matricula.Aluno#getNome <em>Nome</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nome</em>' attribute.
	 * @see #getNome()
	 * @generated
	 */
	void setNome(String value);

	/**
	 * Returns the value of the '<em><b>Numero Matricula</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Numero Matricula</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Numero Matricula</em>' attribute.
	 * @see #setNumeroMatricula(Integer)
	 * @see framework_matricula.Framework_matriculaPackage#getAluno_NumeroMatricula()
	 * @model
	 * @generated
	 */
	Integer getNumeroMatricula();

	/**
	 * Sets the value of the '{@link framework_matricula.Aluno#getNumeroMatricula <em>Numero Matricula</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Numero Matricula</em>' attribute.
	 * @see #getNumeroMatricula()
	 * @generated
	 */
	void setNumeroMatricula(Integer value);

	/**
	 * Returns the value of the '<em><b>Data Nascimento</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Nascimento</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Nascimento</em>' attribute.
	 * @see #setDataNascimento(String)
	 * @see framework_matricula.Framework_matriculaPackage#getAluno_DataNascimento()
	 * @model
	 * @generated
	 */
	String getDataNascimento();

	/**
	 * Sets the value of the '{@link framework_matricula.Aluno#getDataNascimento <em>Data Nascimento</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Nascimento</em>' attribute.
	 * @see #getDataNascimento()
	 * @generated
	 */
	void setDataNascimento(String value);

	/**
	 * Returns the value of the '<em><b>Matricula</b></em>' containment reference list.
	 * The list contents are of type {@link framework_matricula.Matricula}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Matricula</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Matricula</em>' containment reference list.
	 * @see framework_matricula.Framework_matriculaPackage#getAluno_Matricula()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Matricula> getMatricula();

} // Aluno
