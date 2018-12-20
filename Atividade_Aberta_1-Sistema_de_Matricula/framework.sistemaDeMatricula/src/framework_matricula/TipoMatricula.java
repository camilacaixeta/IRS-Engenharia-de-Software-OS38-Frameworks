/**
 */
package framework_matricula;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tipo Matricula</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link framework_matricula.TipoMatricula#getValue <em>Value</em>}</li>
 *   <li>{@link framework_matricula.TipoMatricula#getPRESENCIAL <em>PRESENCIAL</em>}</li>
 *   <li>{@link framework_matricula.TipoMatricula#getVIRTUAL <em>VIRTUAL</em>}</li>
 * </ul>
 *
 * @see framework_matricula.Framework_matriculaPackage#getTipoMatricula()
 * @model
 * @generated
 */
public interface TipoMatricula extends EObject {
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
	 * @see framework_matricula.Framework_matriculaPackage#getTipoMatricula_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link framework_matricula.TipoMatricula#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>PRESENCIAL</b></em>' attribute.
	 * The default value is <code>"Presencial"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PRESENCIAL</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PRESENCIAL</em>' attribute.
	 * @see #setPRESENCIAL(String)
	 * @see framework_matricula.Framework_matriculaPackage#getTipoMatricula_PRESENCIAL()
	 * @model default="Presencial"
	 * @generated
	 */
	String getPRESENCIAL();

	/**
	 * Sets the value of the '{@link framework_matricula.TipoMatricula#getPRESENCIAL <em>PRESENCIAL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PRESENCIAL</em>' attribute.
	 * @see #getPRESENCIAL()
	 * @generated
	 */
	void setPRESENCIAL(String value);

	/**
	 * Returns the value of the '<em><b>VIRTUAL</b></em>' attribute.
	 * The default value is <code>"Virtual"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>VIRTUAL</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>VIRTUAL</em>' attribute.
	 * @see #setVIRTUAL(String)
	 * @see framework_matricula.Framework_matriculaPackage#getTipoMatricula_VIRTUAL()
	 * @model default="Virtual"
	 * @generated
	 */
	String getVIRTUAL();

	/**
	 * Sets the value of the '{@link framework_matricula.TipoMatricula#getVIRTUAL <em>VIRTUAL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>VIRTUAL</em>' attribute.
	 * @see #getVIRTUAL()
	 * @generated
	 */
	void setVIRTUAL(String value);

} // TipoMatricula
