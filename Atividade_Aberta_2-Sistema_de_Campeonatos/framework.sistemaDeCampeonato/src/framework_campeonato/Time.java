/**
 */
package framework_campeonato;

import java.util.List;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link framework_campeonato.Time#getNome <em>Nome</em>}</li>
 *   <li>{@link framework_campeonato.Time#getCodigo <em>Codigo</em>}</li>
 *   <li>{@link framework_campeonato.Time#getJogador <em>Jogador</em>}</li>
 * </ul>
 *
 * @see framework_campeonato.Framework_campeonatoPackage#getTime()
 * @model
 * @generated
 */
public interface Time extends EObject {
	/**
	 * Returns the value of the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nome</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nome</em>' attribute.
	 * @see #setNome(String)
	 * @see framework_campeonato.Framework_campeonatoPackage#getTime_Nome()
	 * @model
	 * @generated
	 */
	String getNome();

	/**
	 * Sets the value of the '{@link framework_campeonato.Time#getNome <em>Nome</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nome</em>' attribute.
	 * @see #getNome()
	 * @generated
	 */
	void setNome(String value);

	/**
	 * Returns the value of the '<em><b>Codigo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Codigo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Codigo</em>' attribute.
	 * @see #setCodigo(Integer)
	 * @see framework_campeonato.Framework_campeonatoPackage#getTime_Codigo()
	 * @model
	 * @generated
	 */
	Integer getCodigo();

	/**
	 * Sets the value of the '{@link framework_campeonato.Time#getCodigo <em>Codigo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Codigo</em>' attribute.
	 * @see #getCodigo()
	 * @generated
	 */
	void setCodigo(Integer value);

	/**
	 * Returns the value of the '<em><b>Jogador</b></em>' containment reference list.
	 * The list contents are of type {@link framework_campeonato.Jogador}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jogador</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jogador</em>' containment reference list.
	 * @see framework_campeonato.Framework_campeonatoPackage#getTime_Jogador()
	 * @model containment="true" required="true"
	 * @generated
	 */
	List<Jogador> getJogador();
	
} // Time
