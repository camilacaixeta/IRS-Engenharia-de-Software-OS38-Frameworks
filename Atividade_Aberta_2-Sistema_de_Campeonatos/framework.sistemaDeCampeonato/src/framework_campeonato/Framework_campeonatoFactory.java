/**
 */
package framework_campeonato;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see framework_campeonato.Framework_campeonatoPackage
 * @generated
 */
public interface Framework_campeonatoFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Framework_campeonatoFactory eINSTANCE = framework_campeonato.impl.Framework_campeonatoFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Campeonato</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Campeonato</em>'.
	 * @generated
	 */
	Campeonato createCampeonato();

	/**
	 * Returns a new object of class '<em>Grupo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Grupo</em>'.
	 * @generated
	 */
	Grupo createGrupo();

	/**
	 * Returns a new object of class '<em>Time</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Time</em>'.
	 * @generated
	 */
	Time createTime();

	/**
	 * Returns a new object of class '<em>Tipo Campeonato</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tipo Campeonato</em>'.
	 * @generated
	 */
	TipoCampeonato createTipoCampeonato();

	/**
	 * Returns a new object of class '<em>Goleiro</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Goleiro</em>'.
	 * @generated
	 */
	Goleiro createGoleiro();

	/**
	 * Returns a new object of class '<em>Zagueiro</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Zagueiro</em>'.
	 * @generated
	 */
	Zagueiro createZagueiro();

	/**
	 * Returns a new object of class '<em>Atacante</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Atacante</em>'.
	 * @generated
	 */
	Atacante createAtacante();

	/**
	 * Returns a new object of class '<em>Lateral</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lateral</em>'.
	 * @generated
	 */
	Lateral createLateral();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Framework_campeonatoPackage getFramework_campeonatoPackage();

} //Framework_campeonatoFactory
