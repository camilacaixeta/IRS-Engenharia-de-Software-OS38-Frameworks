/**
 */
package framework_campeonato.impl;

import framework_campeonato.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Framework_campeonatoFactoryImpl extends EFactoryImpl implements Framework_campeonatoFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Framework_campeonatoFactory init() {
		try {
			Framework_campeonatoFactory theFramework_campeonatoFactory = (Framework_campeonatoFactory)EPackage.Registry.INSTANCE.getEFactory(Framework_campeonatoPackage.eNS_URI);
			if (theFramework_campeonatoFactory != null) {
				return theFramework_campeonatoFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Framework_campeonatoFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Framework_campeonatoFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Framework_campeonatoPackage.CAMPEONATO: return createCampeonato();
			case Framework_campeonatoPackage.GRUPO: return createGrupo();
			case Framework_campeonatoPackage.TIME: return createTime();
			case Framework_campeonatoPackage.TIPO_CAMPEONATO: return createTipoCampeonato();
			case Framework_campeonatoPackage.GOLEIRO: return createGoleiro();
			case Framework_campeonatoPackage.ZAGUEIRO: return createZagueiro();
			case Framework_campeonatoPackage.ATACANTE: return createAtacante();
			case Framework_campeonatoPackage.LATERAL: return createLateral();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Campeonato createCampeonato() {
		CampeonatoImpl campeonato = new CampeonatoImpl();
		return campeonato;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Grupo createGrupo() {
		GrupoImpl grupo = new GrupoImpl();
		return grupo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Time createTime() {
		TimeImpl time = new TimeImpl();
		return time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TipoCampeonato createTipoCampeonato() {
		TipoCampeonatoImpl tipoCampeonato = new TipoCampeonatoImpl();
		return tipoCampeonato;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Goleiro createGoleiro() {
		GoleiroImpl goleiro = new GoleiroImpl();
		return goleiro;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Zagueiro createZagueiro() {
		ZagueiroImpl zagueiro = new ZagueiroImpl();
		return zagueiro;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Atacante createAtacante() {
		AtacanteImpl atacante = new AtacanteImpl();
		return atacante;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lateral createLateral() {
		LateralImpl lateral = new LateralImpl();
		return lateral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Framework_campeonatoPackage getFramework_campeonatoPackage() {
		return (Framework_campeonatoPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Framework_campeonatoPackage getPackage() {
		return Framework_campeonatoPackage.eINSTANCE;
	}

} //Framework_campeonatoFactoryImpl
