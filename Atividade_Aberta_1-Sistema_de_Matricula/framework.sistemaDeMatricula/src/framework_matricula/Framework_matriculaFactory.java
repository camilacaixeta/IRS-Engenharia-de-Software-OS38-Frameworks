/**
 */
package framework_matricula;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see framework_matricula.Framework_matriculaPackage
 * @generated
 */
public interface Framework_matriculaFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Framework_matriculaFactory eINSTANCE = framework_matricula.impl.Framework_matriculaFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Disciplina</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Disciplina</em>'.
	 * @generated
	 */
	Disciplina createDisciplina();

	/**
	 * Returns a new object of class '<em>Matricula</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Matricula</em>'.
	 * @generated
	 */
	Matricula createMatricula();

	/**
	 * Returns a new object of class '<em>Aluno Bolsista</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Aluno Bolsista</em>'.
	 * @generated
	 */
	AlunoBolsista createAlunoBolsista();

	/**
	 * Returns a new object of class '<em>Aluno Comum</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Aluno Comum</em>'.
	 * @generated
	 */
	AlunoComum createAlunoComum();

	/**
	 * Returns a new object of class '<em>Tipo Matricula</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tipo Matricula</em>'.
	 * @generated
	 */
	TipoMatricula createTipoMatricula();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Framework_matriculaPackage getFramework_matriculaPackage();

} //Framework_matriculaFactory
