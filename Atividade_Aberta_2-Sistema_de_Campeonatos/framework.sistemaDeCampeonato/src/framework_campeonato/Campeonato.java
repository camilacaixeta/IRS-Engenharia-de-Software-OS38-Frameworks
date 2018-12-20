/**
 */
package framework_campeonato;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Campeonato</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link framework_campeonato.Campeonato#getNome <em>Nome</em>}</li>
 *   <li>{@link framework_campeonato.Campeonato#getDataInicial <em>Data Inicial</em>}</li>
 *   <li>{@link framework_campeonato.Campeonato#getDataFinal <em>Data Final</em>}</li>
 *   <li>{@link framework_campeonato.Campeonato#getTipoCampeonato <em>Tipo Campeonato</em>}</li>
 *   <li>{@link framework_campeonato.Campeonato#getGrupo <em>Grupo</em>}</li>
 * </ul>
 *
 * @see framework_campeonato.Framework_campeonatoPackage#getCampeonato()
 * @model
 * @generated
 */
public interface Campeonato extends EObject {
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
	 * @see framework_campeonato.Framework_campeonatoPackage#getCampeonato_Nome()
	 * @model
	 * @generated
	 */
	String getNome();

	/**
	 * Sets the value of the '{@link framework_campeonato.Campeonato#getNome <em>Nome</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nome</em>' attribute.
	 * @see #getNome()
	 * @generated
	 */
	void setNome(String value);

	/**
	 * Returns the value of the '<em><b>Data Inicial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Inicial</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Inicial</em>' attribute.
	 * @see #setDataInicial(String)
	 * @see framework_campeonato.Framework_campeonatoPackage#getCampeonato_DataInicial()
	 * @model
	 * @generated
	 */
	String getDataInicial();

	/**
	 * Sets the value of the '{@link framework_campeonato.Campeonato#getDataInicial <em>Data Inicial</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Inicial</em>' attribute.
	 * @see #getDataInicial()
	 * @generated
	 */
	void setDataInicial(String value);

	/**
	 * Returns the value of the '<em><b>Data Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Final</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Final</em>' attribute.
	 * @see #setDataFinal(String)
	 * @see framework_campeonato.Framework_campeonatoPackage#getCampeonato_DataFinal()
	 * @model
	 * @generated
	 */
	String getDataFinal();

	/**
	 * Sets the value of the '{@link framework_campeonato.Campeonato#getDataFinal <em>Data Final</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Final</em>' attribute.
	 * @see #getDataFinal()
	 * @generated
	 */
	void setDataFinal(String value);

	/**
	 * Returns the value of the '<em><b>Tipo Campeonato</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tipo Campeonato</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tipo Campeonato</em>' containment reference.
	 * @see #setTipoCampeonato(TipoCampeonato)
	 * @see framework_campeonato.Framework_campeonatoPackage#getCampeonato_TipoCampeonato()
	 * @model containment="true"
	 * @generated
	 */
	TipoCampeonato getTipoCampeonato();

	/**
	 * Sets the value of the '{@link framework_campeonato.Campeonato#getTipoCampeonato <em>Tipo Campeonato</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tipo Campeonato</em>' containment reference.
	 * @see #getTipoCampeonato()
	 * @generated
	 */
	void setTipoCampeonato(TipoCampeonato value);

	/**
	 * Returns the value of the '<em><b>Grupo</b></em>' containment reference list.
	 * The list contents are of type {@link framework_campeonato.Grupo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Grupo</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grupo</em>' containment reference list.
	 * @see framework_campeonato.Framework_campeonatoPackage#getCampeonato_Grupo()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Grupo> getGrupo();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void decidirFinalistas();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void decidirMVP();

} // Campeonato
