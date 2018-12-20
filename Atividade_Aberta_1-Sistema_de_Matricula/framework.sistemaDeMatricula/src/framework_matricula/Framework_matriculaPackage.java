/**
 */
package framework_matricula;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see framework_matricula.Framework_matriculaFactory
 * @model kind="package"
 * @generated
 */
public interface Framework_matriculaPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "framework_matricula";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///framework_matricula.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "framework_matricula";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Framework_matriculaPackage eINSTANCE = framework_matricula.impl.Framework_matriculaPackageImpl.init();

	/**
	 * The meta object id for the '{@link framework_matricula.impl.DisciplinaImpl <em>Disciplina</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see framework_matricula.impl.DisciplinaImpl
	 * @see framework_matricula.impl.Framework_matriculaPackageImpl#getDisciplina()
	 * @generated
	 */
	int DISCIPLINA = 0;

	/**
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCIPLINA__NOME = 0;

	/**
	 * The feature id for the '<em><b>Codigo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCIPLINA__CODIGO = 1;

	/**
	 * The feature id for the '<em><b>Area Conhecimento</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCIPLINA__AREA_CONHECIMENTO = 2;

	/**
	 * The number of structural features of the '<em>Disciplina</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCIPLINA_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Disciplina</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCIPLINA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link framework_matricula.impl.MatriculaImpl <em>Matricula</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see framework_matricula.impl.MatriculaImpl
	 * @see framework_matricula.impl.Framework_matriculaPackageImpl#getMatricula()
	 * @generated
	 */
	int MATRICULA = 1;

	/**
	 * The feature id for the '<em><b>Codigo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRICULA__CODIGO = 0;

	/**
	 * The feature id for the '<em><b>Disciplina</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRICULA__DISCIPLINA = 1;

	/**
	 * The feature id for the '<em><b>Tipo Matricula</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRICULA__TIPO_MATRICULA = 2;

	/**
	 * The number of structural features of the '<em>Matricula</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRICULA_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Efetuar Matricula</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRICULA___EFETUAR_MATRICULA__STRING_DISCIPLINA_TIPOMATRICULA = 0;

	/**
	 * The number of operations of the '<em>Matricula</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRICULA_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link framework_matricula.Aluno <em>Aluno</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see framework_matricula.Aluno
	 * @see framework_matricula.impl.Framework_matriculaPackageImpl#getAluno()
	 * @generated
	 */
	int ALUNO = 2;

	/**
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO__NOME = 0;

	/**
	 * The feature id for the '<em><b>Numero Matricula</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO__NUMERO_MATRICULA = 1;

	/**
	 * The feature id for the '<em><b>Data Nascimento</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO__DATA_NASCIMENTO = 2;

	/**
	 * The feature id for the '<em><b>Matricula</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO__MATRICULA = 3;

	/**
	 * The number of structural features of the '<em>Aluno</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Aluno</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link framework_matricula.impl.AlunoBolsistaImpl <em>Aluno Bolsista</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see framework_matricula.impl.AlunoBolsistaImpl
	 * @see framework_matricula.impl.Framework_matriculaPackageImpl#getAlunoBolsista()
	 * @generated
	 */
	int ALUNO_BOLSISTA = 3;

	/**
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO_BOLSISTA__NOME = ALUNO__NOME;

	/**
	 * The feature id for the '<em><b>Numero Matricula</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO_BOLSISTA__NUMERO_MATRICULA = ALUNO__NUMERO_MATRICULA;

	/**
	 * The feature id for the '<em><b>Data Nascimento</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO_BOLSISTA__DATA_NASCIMENTO = ALUNO__DATA_NASCIMENTO;

	/**
	 * The feature id for the '<em><b>Matricula</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO_BOLSISTA__MATRICULA = ALUNO__MATRICULA;

	/**
	 * The number of structural features of the '<em>Aluno Bolsista</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO_BOLSISTA_FEATURE_COUNT = ALUNO_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Aluno Bolsista</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO_BOLSISTA_OPERATION_COUNT = ALUNO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link framework_matricula.impl.AlunoComumImpl <em>Aluno Comum</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see framework_matricula.impl.AlunoComumImpl
	 * @see framework_matricula.impl.Framework_matriculaPackageImpl#getAlunoComum()
	 * @generated
	 */
	int ALUNO_COMUM = 4;

	/**
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO_COMUM__NOME = ALUNO__NOME;

	/**
	 * The feature id for the '<em><b>Numero Matricula</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO_COMUM__NUMERO_MATRICULA = ALUNO__NUMERO_MATRICULA;

	/**
	 * The feature id for the '<em><b>Data Nascimento</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO_COMUM__DATA_NASCIMENTO = ALUNO__DATA_NASCIMENTO;

	/**
	 * The feature id for the '<em><b>Matricula</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO_COMUM__MATRICULA = ALUNO__MATRICULA;

	/**
	 * The number of structural features of the '<em>Aluno Comum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO_COMUM_FEATURE_COUNT = ALUNO_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Aluno Comum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO_COMUM_OPERATION_COUNT = ALUNO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link framework_matricula.impl.TipoMatriculaImpl <em>Tipo Matricula</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see framework_matricula.impl.TipoMatriculaImpl
	 * @see framework_matricula.impl.Framework_matriculaPackageImpl#getTipoMatricula()
	 * @generated
	 */
	int TIPO_MATRICULA = 5;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIPO_MATRICULA__VALUE = 0;

	/**
	 * The feature id for the '<em><b>PRESENCIAL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIPO_MATRICULA__PRESENCIAL = 1;

	/**
	 * The feature id for the '<em><b>VIRTUAL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIPO_MATRICULA__VIRTUAL = 2;

	/**
	 * The number of structural features of the '<em>Tipo Matricula</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIPO_MATRICULA_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Tipo Matricula</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIPO_MATRICULA_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link framework_matricula.Disciplina <em>Disciplina</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Disciplina</em>'.
	 * @see framework_matricula.Disciplina
	 * @generated
	 */
	EClass getDisciplina();

	/**
	 * Returns the meta object for the attribute '{@link framework_matricula.Disciplina#getNome <em>Nome</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nome</em>'.
	 * @see framework_matricula.Disciplina#getNome()
	 * @see #getDisciplina()
	 * @generated
	 */
	EAttribute getDisciplina_Nome();

	/**
	 * Returns the meta object for the attribute '{@link framework_matricula.Disciplina#getCodigo <em>Codigo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Codigo</em>'.
	 * @see framework_matricula.Disciplina#getCodigo()
	 * @see #getDisciplina()
	 * @generated
	 */
	EAttribute getDisciplina_Codigo();

	/**
	 * Returns the meta object for the attribute '{@link framework_matricula.Disciplina#getAreaConhecimento <em>Area Conhecimento</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Area Conhecimento</em>'.
	 * @see framework_matricula.Disciplina#getAreaConhecimento()
	 * @see #getDisciplina()
	 * @generated
	 */
	EAttribute getDisciplina_AreaConhecimento();

	/**
	 * Returns the meta object for class '{@link framework_matricula.Matricula <em>Matricula</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Matricula</em>'.
	 * @see framework_matricula.Matricula
	 * @generated
	 */
	EClass getMatricula();

	/**
	 * Returns the meta object for the attribute '{@link framework_matricula.Matricula#getCodigo <em>Codigo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Codigo</em>'.
	 * @see framework_matricula.Matricula#getCodigo()
	 * @see #getMatricula()
	 * @generated
	 */
	EAttribute getMatricula_Codigo();

	/**
	 * Returns the meta object for the containment reference '{@link framework_matricula.Matricula#getDisciplina <em>Disciplina</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Disciplina</em>'.
	 * @see framework_matricula.Matricula#getDisciplina()
	 * @see #getMatricula()
	 * @generated
	 */
	EReference getMatricula_Disciplina();

	/**
	 * Returns the meta object for the containment reference '{@link framework_matricula.Matricula#getTipoMatricula <em>Tipo Matricula</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tipo Matricula</em>'.
	 * @see framework_matricula.Matricula#getTipoMatricula()
	 * @see #getMatricula()
	 * @generated
	 */
	EReference getMatricula_TipoMatricula();

	/**
	 * Returns the meta object for the '{@link framework_matricula.Matricula#efetuarMatricula(java.lang.String, framework_matricula.Disciplina, framework_matricula.TipoMatricula) <em>Efetuar Matricula</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Efetuar Matricula</em>' operation.
	 * @see framework_matricula.Matricula#efetuarMatricula(java.lang.String, framework_matricula.Disciplina, framework_matricula.TipoMatricula)
	 * @generated
	 */
	EOperation getMatricula__EfetuarMatricula__String_Disciplina_TipoMatricula();

	/**
	 * Returns the meta object for class '{@link framework_matricula.Aluno <em>Aluno</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aluno</em>'.
	 * @see framework_matricula.Aluno
	 * @generated
	 */
	EClass getAluno();

	/**
	 * Returns the meta object for the attribute '{@link framework_matricula.Aluno#getNome <em>Nome</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nome</em>'.
	 * @see framework_matricula.Aluno#getNome()
	 * @see #getAluno()
	 * @generated
	 */
	EAttribute getAluno_Nome();

	/**
	 * Returns the meta object for the attribute '{@link framework_matricula.Aluno#getNumeroMatricula <em>Numero Matricula</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Numero Matricula</em>'.
	 * @see framework_matricula.Aluno#getNumeroMatricula()
	 * @see #getAluno()
	 * @generated
	 */
	EAttribute getAluno_NumeroMatricula();

	/**
	 * Returns the meta object for the attribute '{@link framework_matricula.Aluno#getDataNascimento <em>Data Nascimento</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Nascimento</em>'.
	 * @see framework_matricula.Aluno#getDataNascimento()
	 * @see #getAluno()
	 * @generated
	 */
	EAttribute getAluno_DataNascimento();

	/**
	 * Returns the meta object for the containment reference list '{@link framework_matricula.Aluno#getMatricula <em>Matricula</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Matricula</em>'.
	 * @see framework_matricula.Aluno#getMatricula()
	 * @see #getAluno()
	 * @generated
	 */
	EReference getAluno_Matricula();

	/**
	 * Returns the meta object for class '{@link framework_matricula.AlunoBolsista <em>Aluno Bolsista</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aluno Bolsista</em>'.
	 * @see framework_matricula.AlunoBolsista
	 * @generated
	 */
	EClass getAlunoBolsista();

	/**
	 * Returns the meta object for class '{@link framework_matricula.AlunoComum <em>Aluno Comum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aluno Comum</em>'.
	 * @see framework_matricula.AlunoComum
	 * @generated
	 */
	EClass getAlunoComum();

	/**
	 * Returns the meta object for class '{@link framework_matricula.TipoMatricula <em>Tipo Matricula</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tipo Matricula</em>'.
	 * @see framework_matricula.TipoMatricula
	 * @generated
	 */
	EClass getTipoMatricula();

	/**
	 * Returns the meta object for the attribute '{@link framework_matricula.TipoMatricula#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see framework_matricula.TipoMatricula#getValue()
	 * @see #getTipoMatricula()
	 * @generated
	 */
	EAttribute getTipoMatricula_Value();

	/**
	 * Returns the meta object for the attribute '{@link framework_matricula.TipoMatricula#getPRESENCIAL <em>PRESENCIAL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>PRESENCIAL</em>'.
	 * @see framework_matricula.TipoMatricula#getPRESENCIAL()
	 * @see #getTipoMatricula()
	 * @generated
	 */
	EAttribute getTipoMatricula_PRESENCIAL();

	/**
	 * Returns the meta object for the attribute '{@link framework_matricula.TipoMatricula#getVIRTUAL <em>VIRTUAL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>VIRTUAL</em>'.
	 * @see framework_matricula.TipoMatricula#getVIRTUAL()
	 * @see #getTipoMatricula()
	 * @generated
	 */
	EAttribute getTipoMatricula_VIRTUAL();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Framework_matriculaFactory getFramework_matriculaFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link framework_matricula.impl.DisciplinaImpl <em>Disciplina</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see framework_matricula.impl.DisciplinaImpl
		 * @see framework_matricula.impl.Framework_matriculaPackageImpl#getDisciplina()
		 * @generated
		 */
		EClass DISCIPLINA = eINSTANCE.getDisciplina();

		/**
		 * The meta object literal for the '<em><b>Nome</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISCIPLINA__NOME = eINSTANCE.getDisciplina_Nome();

		/**
		 * The meta object literal for the '<em><b>Codigo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISCIPLINA__CODIGO = eINSTANCE.getDisciplina_Codigo();

		/**
		 * The meta object literal for the '<em><b>Area Conhecimento</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISCIPLINA__AREA_CONHECIMENTO = eINSTANCE.getDisciplina_AreaConhecimento();

		/**
		 * The meta object literal for the '{@link framework_matricula.impl.MatriculaImpl <em>Matricula</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see framework_matricula.impl.MatriculaImpl
		 * @see framework_matricula.impl.Framework_matriculaPackageImpl#getMatricula()
		 * @generated
		 */
		EClass MATRICULA = eINSTANCE.getMatricula();

		/**
		 * The meta object literal for the '<em><b>Codigo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATRICULA__CODIGO = eINSTANCE.getMatricula_Codigo();

		/**
		 * The meta object literal for the '<em><b>Disciplina</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATRICULA__DISCIPLINA = eINSTANCE.getMatricula_Disciplina();

		/**
		 * The meta object literal for the '<em><b>Tipo Matricula</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATRICULA__TIPO_MATRICULA = eINSTANCE.getMatricula_TipoMatricula();

		/**
		 * The meta object literal for the '<em><b>Efetuar Matricula</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MATRICULA___EFETUAR_MATRICULA__STRING_DISCIPLINA_TIPOMATRICULA = eINSTANCE.getMatricula__EfetuarMatricula__String_Disciplina_TipoMatricula();

		/**
		 * The meta object literal for the '{@link framework_matricula.Aluno <em>Aluno</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see framework_matricula.Aluno
		 * @see framework_matricula.impl.Framework_matriculaPackageImpl#getAluno()
		 * @generated
		 */
		EClass ALUNO = eINSTANCE.getAluno();

		/**
		 * The meta object literal for the '<em><b>Nome</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALUNO__NOME = eINSTANCE.getAluno_Nome();

		/**
		 * The meta object literal for the '<em><b>Numero Matricula</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALUNO__NUMERO_MATRICULA = eINSTANCE.getAluno_NumeroMatricula();

		/**
		 * The meta object literal for the '<em><b>Data Nascimento</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALUNO__DATA_NASCIMENTO = eINSTANCE.getAluno_DataNascimento();

		/**
		 * The meta object literal for the '<em><b>Matricula</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALUNO__MATRICULA = eINSTANCE.getAluno_Matricula();

		/**
		 * The meta object literal for the '{@link framework_matricula.impl.AlunoBolsistaImpl <em>Aluno Bolsista</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see framework_matricula.impl.AlunoBolsistaImpl
		 * @see framework_matricula.impl.Framework_matriculaPackageImpl#getAlunoBolsista()
		 * @generated
		 */
		EClass ALUNO_BOLSISTA = eINSTANCE.getAlunoBolsista();

		/**
		 * The meta object literal for the '{@link framework_matricula.impl.AlunoComumImpl <em>Aluno Comum</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see framework_matricula.impl.AlunoComumImpl
		 * @see framework_matricula.impl.Framework_matriculaPackageImpl#getAlunoComum()
		 * @generated
		 */
		EClass ALUNO_COMUM = eINSTANCE.getAlunoComum();

		/**
		 * The meta object literal for the '{@link framework_matricula.impl.TipoMatriculaImpl <em>Tipo Matricula</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see framework_matricula.impl.TipoMatriculaImpl
		 * @see framework_matricula.impl.Framework_matriculaPackageImpl#getTipoMatricula()
		 * @generated
		 */
		EClass TIPO_MATRICULA = eINSTANCE.getTipoMatricula();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIPO_MATRICULA__VALUE = eINSTANCE.getTipoMatricula_Value();

		/**
		 * The meta object literal for the '<em><b>PRESENCIAL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIPO_MATRICULA__PRESENCIAL = eINSTANCE.getTipoMatricula_PRESENCIAL();

		/**
		 * The meta object literal for the '<em><b>VIRTUAL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIPO_MATRICULA__VIRTUAL = eINSTANCE.getTipoMatricula_VIRTUAL();

	}

} //Framework_matriculaPackage
