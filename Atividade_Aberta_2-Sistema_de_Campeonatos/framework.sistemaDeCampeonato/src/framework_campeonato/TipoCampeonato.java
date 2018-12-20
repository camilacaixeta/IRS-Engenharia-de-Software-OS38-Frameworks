/**
 */
package framework_campeonato;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tipo Campeonato</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link framework_campeonato.TipoCampeonato#getPONTOS_CORRIDOS <em>PONTOS CORRIDOS</em>}</li>
 *   <li>{@link framework_campeonato.TipoCampeonato#getMATA_MATA <em>MATA MATA</em>}</li>
 *   <li>{@link framework_campeonato.TipoCampeonato#getHIBRIDO <em>HIBRIDO</em>}</li>
 *   <li>{@link framework_campeonato.TipoCampeonato#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see framework_campeonato.Framework_campeonatoPackage#getTipoCampeonato()
 * @model
 * @generated
 */
public interface TipoCampeonato extends EObject {
	/**
	 * Returns the value of the '<em><b>PONTOS CORRIDOS</b></em>' attribute.
	 * The default value is <code>"Pontos Corridos"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PONTOS CORRIDOS</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PONTOS CORRIDOS</em>' attribute.
	 * @see #setPONTOS_CORRIDOS(String)
	 * @see framework_campeonato.Framework_campeonatoPackage#getTipoCampeonato_PONTOS_CORRIDOS()
	 * @model default="Pontos Corridos"
	 * @generated
	 */
	String getPONTOS_CORRIDOS();

	/**
	 * Sets the value of the '{@link framework_campeonato.TipoCampeonato#getPONTOS_CORRIDOS <em>PONTOS CORRIDOS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PONTOS CORRIDOS</em>' attribute.
	 * @see #getPONTOS_CORRIDOS()
	 * @generated
	 */
	void setPONTOS_CORRIDOS(String value);

	/**
	 * Returns the value of the '<em><b>MATA MATA</b></em>' attribute.
	 * The default value is <code>"Mata-mata"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MATA MATA</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MATA MATA</em>' attribute.
	 * @see #setMATA_MATA(String)
	 * @see framework_campeonato.Framework_campeonatoPackage#getTipoCampeonato_MATA_MATA()
	 * @model default="Mata-mata"
	 * @generated
	 */
	String getMATA_MATA();

	/**
	 * Sets the value of the '{@link framework_campeonato.TipoCampeonato#getMATA_MATA <em>MATA MATA</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MATA MATA</em>' attribute.
	 * @see #getMATA_MATA()
	 * @generated
	 */
	void setMATA_MATA(String value);

	/**
	 * Returns the value of the '<em><b>HIBRIDO</b></em>' attribute.
	 * The default value is <code>"H\u00edbrido"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>HIBRIDO</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>HIBRIDO</em>' attribute.
	 * @see #setHIBRIDO(String)
	 * @see framework_campeonato.Framework_campeonatoPackage#getTipoCampeonato_HIBRIDO()
	 * @model default="H\u00edbrido"
	 * @generated
	 */
	String getHIBRIDO();

	/**
	 * Sets the value of the '{@link framework_campeonato.TipoCampeonato#getHIBRIDO <em>HIBRIDO</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>HIBRIDO</em>' attribute.
	 * @see #getHIBRIDO()
	 * @generated
	 */
	void setHIBRIDO(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see framework_campeonato.Framework_campeonatoPackage#getTipoCampeonato_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link framework_campeonato.TipoCampeonato#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // TipoCampeonato
