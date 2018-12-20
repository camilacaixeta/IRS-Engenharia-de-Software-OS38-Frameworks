/**
 */
package framework_matricula;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Matricula</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link framework_matricula.Matricula#getCodigo <em>Codigo</em>}</li>
 *   <li>{@link framework_matricula.Matricula#getDisciplina <em>Disciplina</em>}</li>
 *   <li>{@link framework_matricula.Matricula#getTipoMatricula <em>Tipo Matricula</em>}</li>
 * </ul>
 *
 * @see framework_matricula.Framework_matriculaPackage#getMatricula()
 * @model
 * @generated
 */
public interface Matricula extends EObject {
	/**
	 * Returns the value of the '<em><b>Codigo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Codigo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Codigo</em>' attribute.
	 * @see #setCodigo(String)
	 * @see framework_matricula.Framework_matriculaPackage#getMatricula_Codigo()
	 * @model
	 * @generated
	 */
	String getCodigo();

	/**
	 * Sets the value of the '{@link framework_matricula.Matricula#getCodigo <em>Codigo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Codigo</em>' attribute.
	 * @see #getCodigo()
	 * @generated
	 */
	void setCodigo(String value);

	/**
	 * Returns the value of the '<em><b>Disciplina</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Disciplina</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disciplina</em>' containment reference.
	 * @see #setDisciplina(Disciplina)
	 * @see framework_matricula.Framework_matriculaPackage#getMatricula_Disciplina()
	 * @model containment="true"
	 * @generated
	 */
	Disciplina getDisciplina();

	/**
	 * Sets the value of the '{@link framework_matricula.Matricula#getDisciplina <em>Disciplina</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disciplina</em>' containment reference.
	 * @see #getDisciplina()
	 * @generated
	 */
	void setDisciplina(Disciplina value);

	/**
	 * Returns the value of the '<em><b>Tipo Matricula</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tipo Matricula</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tipo Matricula</em>' containment reference.
	 * @see #setTipoMatricula(TipoMatricula)
	 * @see framework_matricula.Framework_matriculaPackage#getMatricula_TipoMatricula()
	 * @model containment="true"
	 * @generated
	 */
	TipoMatricula getTipoMatricula();

	/**
	 * Sets the value of the '{@link framework_matricula.Matricula#getTipoMatricula <em>Tipo Matricula</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tipo Matricula</em>' containment reference.
	 * @see #getTipoMatricula()
	 * @generated
	 */
	void setTipoMatricula(TipoMatricula value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void efetuarMatricula(String codigo, Disciplina disciplina, TipoMatricula tipoMatricula);

} // Matricula
