/**
 */
package framework_matricula.impl;

import framework_matricula.Aluno;
import framework_matricula.AlunoBolsista;
import framework_matricula.AlunoComum;
import framework_matricula.Disciplina;
import framework_matricula.Framework_matriculaFactory;
import framework_matricula.Framework_matriculaPackage;
import framework_matricula.Matricula;
import framework_matricula.TipoMatricula;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Framework_matriculaPackageImpl extends EPackageImpl implements Framework_matriculaPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass disciplinaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass matriculaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass alunoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass alunoBolsistaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass alunoComumEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tipoMatriculaEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see framework_matricula.Framework_matriculaPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Framework_matriculaPackageImpl() {
		super(eNS_URI, Framework_matriculaFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link Framework_matriculaPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Framework_matriculaPackage init() {
		if (isInited) return (Framework_matriculaPackage)EPackage.Registry.INSTANCE.getEPackage(Framework_matriculaPackage.eNS_URI);

		// Obtain or create and register package
		Framework_matriculaPackageImpl theFramework_matriculaPackage = (Framework_matriculaPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Framework_matriculaPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Framework_matriculaPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theFramework_matriculaPackage.createPackageContents();

		// Initialize created meta-data
		theFramework_matriculaPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theFramework_matriculaPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Framework_matriculaPackage.eNS_URI, theFramework_matriculaPackage);
		return theFramework_matriculaPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDisciplina() {
		return disciplinaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDisciplina_Nome() {
		return (EAttribute)disciplinaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDisciplina_Codigo() {
		return (EAttribute)disciplinaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDisciplina_AreaConhecimento() {
		return (EAttribute)disciplinaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMatricula() {
		return matriculaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMatricula_Codigo() {
		return (EAttribute)matriculaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMatricula_Disciplina() {
		return (EReference)matriculaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMatricula_TipoMatricula() {
		return (EReference)matriculaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMatricula__EfetuarMatricula__String_Disciplina_TipoMatricula() {
		return matriculaEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAluno() {
		return alunoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAluno_Nome() {
		return (EAttribute)alunoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAluno_NumeroMatricula() {
		return (EAttribute)alunoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAluno_DataNascimento() {
		return (EAttribute)alunoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAluno_Matricula() {
		return (EReference)alunoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAlunoBolsista() {
		return alunoBolsistaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAlunoComum() {
		return alunoComumEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTipoMatricula() {
		return tipoMatriculaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTipoMatricula_Value() {
		return (EAttribute)tipoMatriculaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTipoMatricula_PRESENCIAL() {
		return (EAttribute)tipoMatriculaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTipoMatricula_VIRTUAL() {
		return (EAttribute)tipoMatriculaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Framework_matriculaFactory getFramework_matriculaFactory() {
		return (Framework_matriculaFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		disciplinaEClass = createEClass(DISCIPLINA);
		createEAttribute(disciplinaEClass, DISCIPLINA__NOME);
		createEAttribute(disciplinaEClass, DISCIPLINA__CODIGO);
		createEAttribute(disciplinaEClass, DISCIPLINA__AREA_CONHECIMENTO);

		matriculaEClass = createEClass(MATRICULA);
		createEAttribute(matriculaEClass, MATRICULA__CODIGO);
		createEReference(matriculaEClass, MATRICULA__DISCIPLINA);
		createEReference(matriculaEClass, MATRICULA__TIPO_MATRICULA);
		createEOperation(matriculaEClass, MATRICULA___EFETUAR_MATRICULA__STRING_DISCIPLINA_TIPOMATRICULA);

		alunoEClass = createEClass(ALUNO);
		createEAttribute(alunoEClass, ALUNO__NOME);
		createEAttribute(alunoEClass, ALUNO__NUMERO_MATRICULA);
		createEAttribute(alunoEClass, ALUNO__DATA_NASCIMENTO);
		createEReference(alunoEClass, ALUNO__MATRICULA);

		alunoBolsistaEClass = createEClass(ALUNO_BOLSISTA);

		alunoComumEClass = createEClass(ALUNO_COMUM);

		tipoMatriculaEClass = createEClass(TIPO_MATRICULA);
		createEAttribute(tipoMatriculaEClass, TIPO_MATRICULA__VALUE);
		createEAttribute(tipoMatriculaEClass, TIPO_MATRICULA__PRESENCIAL);
		createEAttribute(tipoMatriculaEClass, TIPO_MATRICULA__VIRTUAL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		alunoBolsistaEClass.getESuperTypes().add(this.getAluno());
		alunoComumEClass.getESuperTypes().add(this.getAluno());

		// Initialize classes, features, and operations; add parameters
		initEClass(disciplinaEClass, Disciplina.class, "Disciplina", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDisciplina_Nome(), ecorePackage.getEString(), "nome", null, 0, 1, Disciplina.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDisciplina_Codigo(), ecorePackage.getEIntegerObject(), "codigo", null, 0, 1, Disciplina.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDisciplina_AreaConhecimento(), ecorePackage.getEString(), "areaConhecimento", null, 0, 1, Disciplina.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(matriculaEClass, Matricula.class, "Matricula", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMatricula_Codigo(), ecorePackage.getEString(), "codigo", null, 0, 1, Matricula.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMatricula_Disciplina(), this.getDisciplina(), null, "disciplina", null, 0, 1, Matricula.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMatricula_TipoMatricula(), this.getTipoMatricula(), null, "tipoMatricula", null, 0, 1, Matricula.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getMatricula__EfetuarMatricula__String_Disciplina_TipoMatricula(), null, "efetuarMatricula", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "codigo", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDisciplina(), "disciplina", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTipoMatricula(), "tipoMatricula", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(alunoEClass, Aluno.class, "Aluno", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAluno_Nome(), ecorePackage.getEString(), "nome", null, 0, 1, Aluno.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAluno_NumeroMatricula(), ecorePackage.getEIntegerObject(), "numeroMatricula", null, 0, 1, Aluno.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAluno_DataNascimento(), ecorePackage.getEString(), "dataNascimento", null, 0, 1, Aluno.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAluno_Matricula(), this.getMatricula(), null, "Matricula", null, 1, -1, Aluno.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(alunoBolsistaEClass, AlunoBolsista.class, "AlunoBolsista", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(alunoComumEClass, AlunoComum.class, "AlunoComum", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tipoMatriculaEClass, TipoMatricula.class, "TipoMatricula", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTipoMatricula_Value(), ecorePackage.getEString(), "value", null, 0, 1, TipoMatricula.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTipoMatricula_PRESENCIAL(), ecorePackage.getEString(), "PRESENCIAL", "Presencial", 0, 1, TipoMatricula.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTipoMatricula_VIRTUAL(), ecorePackage.getEString(), "VIRTUAL", "Virtual", 0, 1, TipoMatricula.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //Framework_matriculaPackageImpl
