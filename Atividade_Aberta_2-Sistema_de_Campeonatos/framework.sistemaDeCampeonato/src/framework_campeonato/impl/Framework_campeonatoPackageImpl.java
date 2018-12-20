/**
 */
package framework_campeonato.impl;

import framework_campeonato.Atacante;
import framework_campeonato.Campeonato;
import framework_campeonato.Framework_campeonatoFactory;
import framework_campeonato.Framework_campeonatoPackage;
import framework_campeonato.Goleiro;
import framework_campeonato.Grupo;
import framework_campeonato.Jogador;
import framework_campeonato.Lateral;
import framework_campeonato.Time;
import framework_campeonato.TipoCampeonato;
import framework_campeonato.Zagueiro;

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
public class Framework_campeonatoPackageImpl extends EPackageImpl implements Framework_campeonatoPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass campeonatoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass grupoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jogadorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tipoCampeonatoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass goleiroEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zagueiroEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass atacanteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lateralEClass = null;

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
	 * @see framework_campeonato.Framework_campeonatoPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Framework_campeonatoPackageImpl() {
		super(eNS_URI, Framework_campeonatoFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Framework_campeonatoPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Framework_campeonatoPackage init() {
		if (isInited) return (Framework_campeonatoPackage)EPackage.Registry.INSTANCE.getEPackage(Framework_campeonatoPackage.eNS_URI);

		// Obtain or create and register package
		Framework_campeonatoPackageImpl theFramework_campeonatoPackage = (Framework_campeonatoPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Framework_campeonatoPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Framework_campeonatoPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theFramework_campeonatoPackage.createPackageContents();

		// Initialize created meta-data
		theFramework_campeonatoPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theFramework_campeonatoPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Framework_campeonatoPackage.eNS_URI, theFramework_campeonatoPackage);
		return theFramework_campeonatoPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCampeonato() {
		return campeonatoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCampeonato_Nome() {
		return (EAttribute)campeonatoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCampeonato_DataInicial() {
		return (EAttribute)campeonatoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCampeonato_DataFinal() {
		return (EAttribute)campeonatoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCampeonato_TipoCampeonato() {
		return (EReference)campeonatoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCampeonato_Grupo() {
		return (EReference)campeonatoEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCampeonato__DecidirFinalistas() {
		return campeonatoEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCampeonato__DecidirMVP() {
		return campeonatoEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGrupo() {
		return grupoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGrupo_Nome() {
		return (EAttribute)grupoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGrupo_Codigo() {
		return (EAttribute)grupoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGrupo_Time() {
		return (EReference)grupoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGrupo__Partida() {
		return grupoEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTime() {
		return timeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTime_Nome() {
		return (EAttribute)timeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTime_Codigo() {
		return (EAttribute)timeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTime_Jogador() {
		return (EReference)timeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJogador() {
		return jogadorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJogador_Nome() {
		return (EAttribute)jogadorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJogador_Codigo() {
		return (EAttribute)jogadorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTipoCampeonato() {
		return tipoCampeonatoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTipoCampeonato_PONTOS_CORRIDOS() {
		return (EAttribute)tipoCampeonatoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTipoCampeonato_MATA_MATA() {
		return (EAttribute)tipoCampeonatoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTipoCampeonato_HIBRIDO() {
		return (EAttribute)tipoCampeonatoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTipoCampeonato_Value() {
		return (EAttribute)tipoCampeonatoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGoleiro() {
		return goleiroEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getZagueiro() {
		return zagueiroEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAtacante() {
		return atacanteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLateral() {
		return lateralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Framework_campeonatoFactory getFramework_campeonatoFactory() {
		return (Framework_campeonatoFactory)getEFactoryInstance();
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
		campeonatoEClass = createEClass(CAMPEONATO);
		createEAttribute(campeonatoEClass, CAMPEONATO__NOME);
		createEAttribute(campeonatoEClass, CAMPEONATO__DATA_INICIAL);
		createEAttribute(campeonatoEClass, CAMPEONATO__DATA_FINAL);
		createEReference(campeonatoEClass, CAMPEONATO__TIPO_CAMPEONATO);
		createEReference(campeonatoEClass, CAMPEONATO__GRUPO);
		createEOperation(campeonatoEClass, CAMPEONATO___DECIDIR_FINALISTAS);
		createEOperation(campeonatoEClass, CAMPEONATO___DECIDIR_MVP);

		grupoEClass = createEClass(GRUPO);
		createEAttribute(grupoEClass, GRUPO__NOME);
		createEAttribute(grupoEClass, GRUPO__CODIGO);
		createEReference(grupoEClass, GRUPO__TIME);
		createEOperation(grupoEClass, GRUPO___PARTIDA);

		timeEClass = createEClass(TIME);
		createEAttribute(timeEClass, TIME__NOME);
		createEAttribute(timeEClass, TIME__CODIGO);
		createEReference(timeEClass, TIME__JOGADOR);

		jogadorEClass = createEClass(JOGADOR);
		createEAttribute(jogadorEClass, JOGADOR__NOME);
		createEAttribute(jogadorEClass, JOGADOR__CODIGO);

		tipoCampeonatoEClass = createEClass(TIPO_CAMPEONATO);
		createEAttribute(tipoCampeonatoEClass, TIPO_CAMPEONATO__PONTOS_CORRIDOS);
		createEAttribute(tipoCampeonatoEClass, TIPO_CAMPEONATO__MATA_MATA);
		createEAttribute(tipoCampeonatoEClass, TIPO_CAMPEONATO__HIBRIDO);
		createEAttribute(tipoCampeonatoEClass, TIPO_CAMPEONATO__VALUE);

		goleiroEClass = createEClass(GOLEIRO);

		zagueiroEClass = createEClass(ZAGUEIRO);

		atacanteEClass = createEClass(ATACANTE);

		lateralEClass = createEClass(LATERAL);
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
		goleiroEClass.getESuperTypes().add(this.getJogador());
		zagueiroEClass.getESuperTypes().add(this.getJogador());
		atacanteEClass.getESuperTypes().add(this.getJogador());
		lateralEClass.getESuperTypes().add(this.getJogador());

		// Initialize classes, features, and operations; add parameters
		initEClass(campeonatoEClass, Campeonato.class, "Campeonato", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCampeonato_Nome(), ecorePackage.getEString(), "nome", null, 0, 1, Campeonato.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCampeonato_DataInicial(), ecorePackage.getEString(), "dataInicial", null, 0, 1, Campeonato.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCampeonato_DataFinal(), ecorePackage.getEString(), "dataFinal", null, 0, 1, Campeonato.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCampeonato_TipoCampeonato(), this.getTipoCampeonato(), null, "tipoCampeonato", null, 0, 1, Campeonato.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCampeonato_Grupo(), this.getGrupo(), null, "Grupo", null, 1, -1, Campeonato.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getCampeonato__DecidirFinalistas(), null, "decidirFinalistas", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getCampeonato__DecidirMVP(), null, "decidirMVP", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(grupoEClass, Grupo.class, "Grupo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGrupo_Nome(), ecorePackage.getEString(), "nome", null, 0, 1, Grupo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGrupo_Codigo(), ecorePackage.getEString(), "codigo", null, 0, 1, Grupo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGrupo_Time(), this.getTime(), null, "Time", null, 1, -1, Grupo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getGrupo__Partida(), null, "partida", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(timeEClass, Time.class, "Time", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTime_Nome(), ecorePackage.getEString(), "nome", null, 0, 1, Time.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTime_Codigo(), ecorePackage.getEIntegerObject(), "codigo", null, 0, 1, Time.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTime_Jogador(), this.getJogador(), null, "Jogador", null, 1, -1, Time.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jogadorEClass, Jogador.class, "Jogador", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJogador_Nome(), ecorePackage.getEString(), "nome", null, 0, 1, Jogador.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJogador_Codigo(), ecorePackage.getEIntegerObject(), "codigo", null, 0, 1, Jogador.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tipoCampeonatoEClass, TipoCampeonato.class, "TipoCampeonato", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTipoCampeonato_PONTOS_CORRIDOS(), ecorePackage.getEString(), "PONTOS_CORRIDOS", "Pontos Corridos", 0, 1, TipoCampeonato.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTipoCampeonato_MATA_MATA(), ecorePackage.getEString(), "MATA_MATA", "Mata-mata", 0, 1, TipoCampeonato.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTipoCampeonato_HIBRIDO(), ecorePackage.getEString(), "HIBRIDO", "H\u00edbrido", 0, 1, TipoCampeonato.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTipoCampeonato_Value(), ecorePackage.getEString(), "value", null, 0, 1, TipoCampeonato.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(goleiroEClass, Goleiro.class, "Goleiro", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(zagueiroEClass, Zagueiro.class, "Zagueiro", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(atacanteEClass, Atacante.class, "Atacante", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(lateralEClass, Lateral.class, "Lateral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //Framework_campeonatoPackageImpl
