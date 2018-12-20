/**
 */
package framework_campeonato.util;

import framework_campeonato.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see framework_campeonato.Framework_campeonatoPackage
 * @generated
 */
public class Framework_campeonatoAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Framework_campeonatoPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Framework_campeonatoAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Framework_campeonatoPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Framework_campeonatoSwitch<Adapter> modelSwitch =
		new Framework_campeonatoSwitch<Adapter>() {
			@Override
			public Adapter caseCampeonato(Campeonato object) {
				return createCampeonatoAdapter();
			}
			@Override
			public Adapter caseGrupo(Grupo object) {
				return createGrupoAdapter();
			}
			@Override
			public Adapter caseTime(Time object) {
				return createTimeAdapter();
			}
			@Override
			public Adapter caseJogador(Jogador object) {
				return createJogadorAdapter();
			}
			@Override
			public Adapter caseTipoCampeonato(TipoCampeonato object) {
				return createTipoCampeonatoAdapter();
			}
			@Override
			public Adapter caseGoleiro(Goleiro object) {
				return createGoleiroAdapter();
			}
			@Override
			public Adapter caseZagueiro(Zagueiro object) {
				return createZagueiroAdapter();
			}
			@Override
			public Adapter caseAtacante(Atacante object) {
				return createAtacanteAdapter();
			}
			@Override
			public Adapter caseLateral(Lateral object) {
				return createLateralAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link framework_campeonato.Campeonato <em>Campeonato</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see framework_campeonato.Campeonato
	 * @generated
	 */
	public Adapter createCampeonatoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link framework_campeonato.Grupo <em>Grupo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see framework_campeonato.Grupo
	 * @generated
	 */
	public Adapter createGrupoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link framework_campeonato.Time <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see framework_campeonato.Time
	 * @generated
	 */
	public Adapter createTimeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link framework_campeonato.Jogador <em>Jogador</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see framework_campeonato.Jogador
	 * @generated
	 */
	public Adapter createJogadorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link framework_campeonato.TipoCampeonato <em>Tipo Campeonato</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see framework_campeonato.TipoCampeonato
	 * @generated
	 */
	public Adapter createTipoCampeonatoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link framework_campeonato.Goleiro <em>Goleiro</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see framework_campeonato.Goleiro
	 * @generated
	 */
	public Adapter createGoleiroAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link framework_campeonato.Zagueiro <em>Zagueiro</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see framework_campeonato.Zagueiro
	 * @generated
	 */
	public Adapter createZagueiroAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link framework_campeonato.Atacante <em>Atacante</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see framework_campeonato.Atacante
	 * @generated
	 */
	public Adapter createAtacanteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link framework_campeonato.Lateral <em>Lateral</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see framework_campeonato.Lateral
	 * @generated
	 */
	public Adapter createLateralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //Framework_campeonatoAdapterFactory
