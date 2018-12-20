/**
 */
package framework_campeonato.util;

import framework_campeonato.*;

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
 * @see framework_campeonato.Framework_campeonatoPackage
 * @generated
 */
public class Framework_campeonatoSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Framework_campeonatoPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Framework_campeonatoSwitch() {
		if (modelPackage == null) {
			modelPackage = Framework_campeonatoPackage.eINSTANCE;
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
			case Framework_campeonatoPackage.CAMPEONATO: {
				Campeonato campeonato = (Campeonato)theEObject;
				T result = caseCampeonato(campeonato);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Framework_campeonatoPackage.GRUPO: {
				Grupo grupo = (Grupo)theEObject;
				T result = caseGrupo(grupo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Framework_campeonatoPackage.TIME: {
				Time time = (Time)theEObject;
				T result = caseTime(time);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Framework_campeonatoPackage.JOGADOR: {
				Jogador jogador = (Jogador)theEObject;
				T result = caseJogador(jogador);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Framework_campeonatoPackage.TIPO_CAMPEONATO: {
				TipoCampeonato tipoCampeonato = (TipoCampeonato)theEObject;
				T result = caseTipoCampeonato(tipoCampeonato);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Framework_campeonatoPackage.GOLEIRO: {
				Goleiro goleiro = (Goleiro)theEObject;
				T result = caseGoleiro(goleiro);
				if (result == null) result = caseJogador(goleiro);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Framework_campeonatoPackage.ZAGUEIRO: {
				Zagueiro zagueiro = (Zagueiro)theEObject;
				T result = caseZagueiro(zagueiro);
				if (result == null) result = caseJogador(zagueiro);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Framework_campeonatoPackage.ATACANTE: {
				Atacante atacante = (Atacante)theEObject;
				T result = caseAtacante(atacante);
				if (result == null) result = caseJogador(atacante);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Framework_campeonatoPackage.LATERAL: {
				Lateral lateral = (Lateral)theEObject;
				T result = caseLateral(lateral);
				if (result == null) result = caseJogador(lateral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Campeonato</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Campeonato</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCampeonato(Campeonato object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Grupo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Grupo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGrupo(Grupo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTime(Time object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Jogador</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Jogador</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJogador(Jogador object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tipo Campeonato</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tipo Campeonato</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTipoCampeonato(TipoCampeonato object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Goleiro</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Goleiro</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGoleiro(Goleiro object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Zagueiro</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Zagueiro</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZagueiro(Zagueiro object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Atacante</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Atacante</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAtacante(Atacante object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lateral</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lateral</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLateral(Lateral object) {
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

} //Framework_campeonatoSwitch
