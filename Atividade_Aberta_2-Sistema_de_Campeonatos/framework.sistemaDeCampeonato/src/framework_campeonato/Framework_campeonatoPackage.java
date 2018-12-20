/**
 */
package framework_campeonato;

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
 * @see framework_campeonato.Framework_campeonatoFactory
 * @model kind="package"
 * @generated
 */
public interface Framework_campeonatoPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "framework_campeonato";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///framework_campeonato.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "framework_campeonato";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Framework_campeonatoPackage eINSTANCE = framework_campeonato.impl.Framework_campeonatoPackageImpl.init();

	/**
	 * The meta object id for the '{@link framework_campeonato.impl.CampeonatoImpl <em>Campeonato</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see framework_campeonato.impl.CampeonatoImpl
	 * @see framework_campeonato.impl.Framework_campeonatoPackageImpl#getCampeonato()
	 * @generated
	 */
	int CAMPEONATO = 0;

	/**
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMPEONATO__NOME = 0;

	/**
	 * The feature id for the '<em><b>Data Inicial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMPEONATO__DATA_INICIAL = 1;

	/**
	 * The feature id for the '<em><b>Data Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMPEONATO__DATA_FINAL = 2;

	/**
	 * The feature id for the '<em><b>Tipo Campeonato</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMPEONATO__TIPO_CAMPEONATO = 3;

	/**
	 * The feature id for the '<em><b>Grupo</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMPEONATO__GRUPO = 4;

	/**
	 * The number of structural features of the '<em>Campeonato</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMPEONATO_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>Decidir Finalistas</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMPEONATO___DECIDIR_FINALISTAS = 0;

	/**
	 * The operation id for the '<em>Decidir MVP</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMPEONATO___DECIDIR_MVP = 1;

	/**
	 * The number of operations of the '<em>Campeonato</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMPEONATO_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link framework_campeonato.impl.GrupoImpl <em>Grupo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see framework_campeonato.impl.GrupoImpl
	 * @see framework_campeonato.impl.Framework_campeonatoPackageImpl#getGrupo()
	 * @generated
	 */
	int GRUPO = 1;

	/**
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRUPO__NOME = 0;

	/**
	 * The feature id for the '<em><b>Codigo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRUPO__CODIGO = 1;

	/**
	 * The feature id for the '<em><b>Time</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRUPO__TIME = 2;

	/**
	 * The number of structural features of the '<em>Grupo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRUPO_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Partida</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRUPO___PARTIDA = 0;

	/**
	 * The number of operations of the '<em>Grupo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRUPO_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link framework_campeonato.impl.TimeImpl <em>Time</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see framework_campeonato.impl.TimeImpl
	 * @see framework_campeonato.impl.Framework_campeonatoPackageImpl#getTime()
	 * @generated
	 */
	int TIME = 2;

	/**
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME__NOME = 0;

	/**
	 * The feature id for the '<em><b>Codigo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME__CODIGO = 1;

	/**
	 * The feature id for the '<em><b>Jogador</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME__JOGADOR = 2;

	/**
	 * The number of structural features of the '<em>Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link framework_campeonato.Jogador <em>Jogador</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see framework_campeonato.Jogador
	 * @see framework_campeonato.impl.Framework_campeonatoPackageImpl#getJogador()
	 * @generated
	 */
	int JOGADOR = 3;

	/**
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOGADOR__NOME = 0;

	/**
	 * The feature id for the '<em><b>Codigo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOGADOR__CODIGO = 1;

	/**
	 * The number of structural features of the '<em>Jogador</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOGADOR_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Jogador</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOGADOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link framework_campeonato.impl.TipoCampeonatoImpl <em>Tipo Campeonato</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see framework_campeonato.impl.TipoCampeonatoImpl
	 * @see framework_campeonato.impl.Framework_campeonatoPackageImpl#getTipoCampeonato()
	 * @generated
	 */
	int TIPO_CAMPEONATO = 4;

	/**
	 * The feature id for the '<em><b>PONTOS CORRIDOS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIPO_CAMPEONATO__PONTOS_CORRIDOS = 0;

	/**
	 * The feature id for the '<em><b>MATA MATA</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIPO_CAMPEONATO__MATA_MATA = 1;

	/**
	 * The feature id for the '<em><b>HIBRIDO</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIPO_CAMPEONATO__HIBRIDO = 2;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIPO_CAMPEONATO__VALUE = 3;

	/**
	 * The number of structural features of the '<em>Tipo Campeonato</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIPO_CAMPEONATO_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Tipo Campeonato</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIPO_CAMPEONATO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link framework_campeonato.impl.GoleiroImpl <em>Goleiro</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see framework_campeonato.impl.GoleiroImpl
	 * @see framework_campeonato.impl.Framework_campeonatoPackageImpl#getGoleiro()
	 * @generated
	 */
	int GOLEIRO = 5;

	/**
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOLEIRO__NOME = JOGADOR__NOME;

	/**
	 * The feature id for the '<em><b>Codigo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOLEIRO__CODIGO = JOGADOR__CODIGO;

	/**
	 * The number of structural features of the '<em>Goleiro</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOLEIRO_FEATURE_COUNT = JOGADOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Goleiro</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOLEIRO_OPERATION_COUNT = JOGADOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link framework_campeonato.impl.ZagueiroImpl <em>Zagueiro</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see framework_campeonato.impl.ZagueiroImpl
	 * @see framework_campeonato.impl.Framework_campeonatoPackageImpl#getZagueiro()
	 * @generated
	 */
	int ZAGUEIRO = 6;

	/**
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZAGUEIRO__NOME = JOGADOR__NOME;

	/**
	 * The feature id for the '<em><b>Codigo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZAGUEIRO__CODIGO = JOGADOR__CODIGO;

	/**
	 * The number of structural features of the '<em>Zagueiro</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZAGUEIRO_FEATURE_COUNT = JOGADOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Zagueiro</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZAGUEIRO_OPERATION_COUNT = JOGADOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link framework_campeonato.impl.AtacanteImpl <em>Atacante</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see framework_campeonato.impl.AtacanteImpl
	 * @see framework_campeonato.impl.Framework_campeonatoPackageImpl#getAtacante()
	 * @generated
	 */
	int ATACANTE = 7;

	/**
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATACANTE__NOME = JOGADOR__NOME;

	/**
	 * The feature id for the '<em><b>Codigo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATACANTE__CODIGO = JOGADOR__CODIGO;

	/**
	 * The number of structural features of the '<em>Atacante</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATACANTE_FEATURE_COUNT = JOGADOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Atacante</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATACANTE_OPERATION_COUNT = JOGADOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link framework_campeonato.impl.LateralImpl <em>Lateral</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see framework_campeonato.impl.LateralImpl
	 * @see framework_campeonato.impl.Framework_campeonatoPackageImpl#getLateral()
	 * @generated
	 */
	int LATERAL = 8;

	/**
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATERAL__NOME = JOGADOR__NOME;

	/**
	 * The feature id for the '<em><b>Codigo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATERAL__CODIGO = JOGADOR__CODIGO;

	/**
	 * The number of structural features of the '<em>Lateral</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATERAL_FEATURE_COUNT = JOGADOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Lateral</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATERAL_OPERATION_COUNT = JOGADOR_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link framework_campeonato.Campeonato <em>Campeonato</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Campeonato</em>'.
	 * @see framework_campeonato.Campeonato
	 * @generated
	 */
	EClass getCampeonato();

	/**
	 * Returns the meta object for the attribute '{@link framework_campeonato.Campeonato#getNome <em>Nome</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nome</em>'.
	 * @see framework_campeonato.Campeonato#getNome()
	 * @see #getCampeonato()
	 * @generated
	 */
	EAttribute getCampeonato_Nome();

	/**
	 * Returns the meta object for the attribute '{@link framework_campeonato.Campeonato#getDataInicial <em>Data Inicial</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Inicial</em>'.
	 * @see framework_campeonato.Campeonato#getDataInicial()
	 * @see #getCampeonato()
	 * @generated
	 */
	EAttribute getCampeonato_DataInicial();

	/**
	 * Returns the meta object for the attribute '{@link framework_campeonato.Campeonato#getDataFinal <em>Data Final</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Final</em>'.
	 * @see framework_campeonato.Campeonato#getDataFinal()
	 * @see #getCampeonato()
	 * @generated
	 */
	EAttribute getCampeonato_DataFinal();

	/**
	 * Returns the meta object for the containment reference '{@link framework_campeonato.Campeonato#getTipoCampeonato <em>Tipo Campeonato</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tipo Campeonato</em>'.
	 * @see framework_campeonato.Campeonato#getTipoCampeonato()
	 * @see #getCampeonato()
	 * @generated
	 */
	EReference getCampeonato_TipoCampeonato();

	/**
	 * Returns the meta object for the containment reference list '{@link framework_campeonato.Campeonato#getGrupo <em>Grupo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Grupo</em>'.
	 * @see framework_campeonato.Campeonato#getGrupo()
	 * @see #getCampeonato()
	 * @generated
	 */
	EReference getCampeonato_Grupo();

	/**
	 * Returns the meta object for the '{@link framework_campeonato.Campeonato#decidirFinalistas() <em>Decidir Finalistas</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Decidir Finalistas</em>' operation.
	 * @see framework_campeonato.Campeonato#decidirFinalistas()
	 * @generated
	 */
	EOperation getCampeonato__DecidirFinalistas();

	/**
	 * Returns the meta object for the '{@link framework_campeonato.Campeonato#decidirMVP() <em>Decidir MVP</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Decidir MVP</em>' operation.
	 * @see framework_campeonato.Campeonato#decidirMVP()
	 * @generated
	 */
	EOperation getCampeonato__DecidirMVP();

	/**
	 * Returns the meta object for class '{@link framework_campeonato.Grupo <em>Grupo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Grupo</em>'.
	 * @see framework_campeonato.Grupo
	 * @generated
	 */
	EClass getGrupo();

	/**
	 * Returns the meta object for the attribute '{@link framework_campeonato.Grupo#getNome <em>Nome</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nome</em>'.
	 * @see framework_campeonato.Grupo#getNome()
	 * @see #getGrupo()
	 * @generated
	 */
	EAttribute getGrupo_Nome();

	/**
	 * Returns the meta object for the attribute '{@link framework_campeonato.Grupo#getCodigo <em>Codigo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Codigo</em>'.
	 * @see framework_campeonato.Grupo#getCodigo()
	 * @see #getGrupo()
	 * @generated
	 */
	EAttribute getGrupo_Codigo();

	/**
	 * Returns the meta object for the containment reference list '{@link framework_campeonato.Grupo#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Time</em>'.
	 * @see framework_campeonato.Grupo#getTime()
	 * @see #getGrupo()
	 * @generated
	 */
	EReference getGrupo_Time();

	/**
	 * Returns the meta object for the '{@link framework_campeonato.Grupo#partida() <em>Partida</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Partida</em>' operation.
	 * @see framework_campeonato.Grupo#partida()
	 * @generated
	 */
	EOperation getGrupo__Partida();

	/**
	 * Returns the meta object for class '{@link framework_campeonato.Time <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time</em>'.
	 * @see framework_campeonato.Time
	 * @generated
	 */
	EClass getTime();

	/**
	 * Returns the meta object for the attribute '{@link framework_campeonato.Time#getNome <em>Nome</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nome</em>'.
	 * @see framework_campeonato.Time#getNome()
	 * @see #getTime()
	 * @generated
	 */
	EAttribute getTime_Nome();

	/**
	 * Returns the meta object for the attribute '{@link framework_campeonato.Time#getCodigo <em>Codigo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Codigo</em>'.
	 * @see framework_campeonato.Time#getCodigo()
	 * @see #getTime()
	 * @generated
	 */
	EAttribute getTime_Codigo();

	/**
	 * Returns the meta object for the containment reference list '{@link framework_campeonato.Time#getJogador <em>Jogador</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Jogador</em>'.
	 * @see framework_campeonato.Time#getJogador()
	 * @see #getTime()
	 * @generated
	 */
	EReference getTime_Jogador();

	/**
	 * Returns the meta object for class '{@link framework_campeonato.Jogador <em>Jogador</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Jogador</em>'.
	 * @see framework_campeonato.Jogador
	 * @generated
	 */
	EClass getJogador();

	/**
	 * Returns the meta object for the attribute '{@link framework_campeonato.Jogador#getNome <em>Nome</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nome</em>'.
	 * @see framework_campeonato.Jogador#getNome()
	 * @see #getJogador()
	 * @generated
	 */
	EAttribute getJogador_Nome();

	/**
	 * Returns the meta object for the attribute '{@link framework_campeonato.Jogador#getCodigo <em>Codigo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Codigo</em>'.
	 * @see framework_campeonato.Jogador#getCodigo()
	 * @see #getJogador()
	 * @generated
	 */
	EAttribute getJogador_Codigo();

	/**
	 * Returns the meta object for class '{@link framework_campeonato.TipoCampeonato <em>Tipo Campeonato</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tipo Campeonato</em>'.
	 * @see framework_campeonato.TipoCampeonato
	 * @generated
	 */
	EClass getTipoCampeonato();

	/**
	 * Returns the meta object for the attribute '{@link framework_campeonato.TipoCampeonato#getPONTOS_CORRIDOS <em>PONTOS CORRIDOS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>PONTOS CORRIDOS</em>'.
	 * @see framework_campeonato.TipoCampeonato#getPONTOS_CORRIDOS()
	 * @see #getTipoCampeonato()
	 * @generated
	 */
	EAttribute getTipoCampeonato_PONTOS_CORRIDOS();

	/**
	 * Returns the meta object for the attribute '{@link framework_campeonato.TipoCampeonato#getMATA_MATA <em>MATA MATA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>MATA MATA</em>'.
	 * @see framework_campeonato.TipoCampeonato#getMATA_MATA()
	 * @see #getTipoCampeonato()
	 * @generated
	 */
	EAttribute getTipoCampeonato_MATA_MATA();

	/**
	 * Returns the meta object for the attribute '{@link framework_campeonato.TipoCampeonato#getHIBRIDO <em>HIBRIDO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>HIBRIDO</em>'.
	 * @see framework_campeonato.TipoCampeonato#getHIBRIDO()
	 * @see #getTipoCampeonato()
	 * @generated
	 */
	EAttribute getTipoCampeonato_HIBRIDO();

	/**
	 * Returns the meta object for the attribute '{@link framework_campeonato.TipoCampeonato#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see framework_campeonato.TipoCampeonato#getValue()
	 * @see #getTipoCampeonato()
	 * @generated
	 */
	EAttribute getTipoCampeonato_Value();

	/**
	 * Returns the meta object for class '{@link framework_campeonato.Goleiro <em>Goleiro</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Goleiro</em>'.
	 * @see framework_campeonato.Goleiro
	 * @generated
	 */
	EClass getGoleiro();

	/**
	 * Returns the meta object for class '{@link framework_campeonato.Zagueiro <em>Zagueiro</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Zagueiro</em>'.
	 * @see framework_campeonato.Zagueiro
	 * @generated
	 */
	EClass getZagueiro();

	/**
	 * Returns the meta object for class '{@link framework_campeonato.Atacante <em>Atacante</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Atacante</em>'.
	 * @see framework_campeonato.Atacante
	 * @generated
	 */
	EClass getAtacante();

	/**
	 * Returns the meta object for class '{@link framework_campeonato.Lateral <em>Lateral</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lateral</em>'.
	 * @see framework_campeonato.Lateral
	 * @generated
	 */
	EClass getLateral();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Framework_campeonatoFactory getFramework_campeonatoFactory();

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
		 * The meta object literal for the '{@link framework_campeonato.impl.CampeonatoImpl <em>Campeonato</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see framework_campeonato.impl.CampeonatoImpl
		 * @see framework_campeonato.impl.Framework_campeonatoPackageImpl#getCampeonato()
		 * @generated
		 */
		EClass CAMPEONATO = eINSTANCE.getCampeonato();

		/**
		 * The meta object literal for the '<em><b>Nome</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAMPEONATO__NOME = eINSTANCE.getCampeonato_Nome();

		/**
		 * The meta object literal for the '<em><b>Data Inicial</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAMPEONATO__DATA_INICIAL = eINSTANCE.getCampeonato_DataInicial();

		/**
		 * The meta object literal for the '<em><b>Data Final</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAMPEONATO__DATA_FINAL = eINSTANCE.getCampeonato_DataFinal();

		/**
		 * The meta object literal for the '<em><b>Tipo Campeonato</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAMPEONATO__TIPO_CAMPEONATO = eINSTANCE.getCampeonato_TipoCampeonato();

		/**
		 * The meta object literal for the '<em><b>Grupo</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAMPEONATO__GRUPO = eINSTANCE.getCampeonato_Grupo();

		/**
		 * The meta object literal for the '<em><b>Decidir Finalistas</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CAMPEONATO___DECIDIR_FINALISTAS = eINSTANCE.getCampeonato__DecidirFinalistas();

		/**
		 * The meta object literal for the '<em><b>Decidir MVP</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CAMPEONATO___DECIDIR_MVP = eINSTANCE.getCampeonato__DecidirMVP();

		/**
		 * The meta object literal for the '{@link framework_campeonato.impl.GrupoImpl <em>Grupo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see framework_campeonato.impl.GrupoImpl
		 * @see framework_campeonato.impl.Framework_campeonatoPackageImpl#getGrupo()
		 * @generated
		 */
		EClass GRUPO = eINSTANCE.getGrupo();

		/**
		 * The meta object literal for the '<em><b>Nome</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRUPO__NOME = eINSTANCE.getGrupo_Nome();

		/**
		 * The meta object literal for the '<em><b>Codigo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRUPO__CODIGO = eINSTANCE.getGrupo_Codigo();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRUPO__TIME = eINSTANCE.getGrupo_Time();

		/**
		 * The meta object literal for the '<em><b>Partida</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GRUPO___PARTIDA = eINSTANCE.getGrupo__Partida();

		/**
		 * The meta object literal for the '{@link framework_campeonato.impl.TimeImpl <em>Time</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see framework_campeonato.impl.TimeImpl
		 * @see framework_campeonato.impl.Framework_campeonatoPackageImpl#getTime()
		 * @generated
		 */
		EClass TIME = eINSTANCE.getTime();

		/**
		 * The meta object literal for the '<em><b>Nome</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME__NOME = eINSTANCE.getTime_Nome();

		/**
		 * The meta object literal for the '<em><b>Codigo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME__CODIGO = eINSTANCE.getTime_Codigo();

		/**
		 * The meta object literal for the '<em><b>Jogador</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME__JOGADOR = eINSTANCE.getTime_Jogador();

		/**
		 * The meta object literal for the '{@link framework_campeonato.Jogador <em>Jogador</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see framework_campeonato.Jogador
		 * @see framework_campeonato.impl.Framework_campeonatoPackageImpl#getJogador()
		 * @generated
		 */
		EClass JOGADOR = eINSTANCE.getJogador();

		/**
		 * The meta object literal for the '<em><b>Nome</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOGADOR__NOME = eINSTANCE.getJogador_Nome();

		/**
		 * The meta object literal for the '<em><b>Codigo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOGADOR__CODIGO = eINSTANCE.getJogador_Codigo();

		/**
		 * The meta object literal for the '{@link framework_campeonato.impl.TipoCampeonatoImpl <em>Tipo Campeonato</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see framework_campeonato.impl.TipoCampeonatoImpl
		 * @see framework_campeonato.impl.Framework_campeonatoPackageImpl#getTipoCampeonato()
		 * @generated
		 */
		EClass TIPO_CAMPEONATO = eINSTANCE.getTipoCampeonato();

		/**
		 * The meta object literal for the '<em><b>PONTOS CORRIDOS</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIPO_CAMPEONATO__PONTOS_CORRIDOS = eINSTANCE.getTipoCampeonato_PONTOS_CORRIDOS();

		/**
		 * The meta object literal for the '<em><b>MATA MATA</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIPO_CAMPEONATO__MATA_MATA = eINSTANCE.getTipoCampeonato_MATA_MATA();

		/**
		 * The meta object literal for the '<em><b>HIBRIDO</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIPO_CAMPEONATO__HIBRIDO = eINSTANCE.getTipoCampeonato_HIBRIDO();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIPO_CAMPEONATO__VALUE = eINSTANCE.getTipoCampeonato_Value();

		/**
		 * The meta object literal for the '{@link framework_campeonato.impl.GoleiroImpl <em>Goleiro</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see framework_campeonato.impl.GoleiroImpl
		 * @see framework_campeonato.impl.Framework_campeonatoPackageImpl#getGoleiro()
		 * @generated
		 */
		EClass GOLEIRO = eINSTANCE.getGoleiro();

		/**
		 * The meta object literal for the '{@link framework_campeonato.impl.ZagueiroImpl <em>Zagueiro</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see framework_campeonato.impl.ZagueiroImpl
		 * @see framework_campeonato.impl.Framework_campeonatoPackageImpl#getZagueiro()
		 * @generated
		 */
		EClass ZAGUEIRO = eINSTANCE.getZagueiro();

		/**
		 * The meta object literal for the '{@link framework_campeonato.impl.AtacanteImpl <em>Atacante</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see framework_campeonato.impl.AtacanteImpl
		 * @see framework_campeonato.impl.Framework_campeonatoPackageImpl#getAtacante()
		 * @generated
		 */
		EClass ATACANTE = eINSTANCE.getAtacante();

		/**
		 * The meta object literal for the '{@link framework_campeonato.impl.LateralImpl <em>Lateral</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see framework_campeonato.impl.LateralImpl
		 * @see framework_campeonato.impl.Framework_campeonatoPackageImpl#getLateral()
		 * @generated
		 */
		EClass LATERAL = eINSTANCE.getLateral();

	}

} //Framework_campeonatoPackage
