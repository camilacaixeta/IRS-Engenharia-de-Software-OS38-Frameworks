/**
 */
package framework_matricula.impl;

import framework_matricula.*;

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
public class Framework_matriculaFactoryImpl extends EFactoryImpl implements Framework_matriculaFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Framework_matriculaFactory init() {
		try {
			Framework_matriculaFactory theFramework_matriculaFactory = (Framework_matriculaFactory)EPackage.Registry.INSTANCE.getEFactory(Framework_matriculaPackage.eNS_URI);
			if (theFramework_matriculaFactory != null) {
				return theFramework_matriculaFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Framework_matriculaFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Framework_matriculaFactoryImpl() {
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
			case Framework_matriculaPackage.DISCIPLINA: return createDisciplina();
			case Framework_matriculaPackage.MATRICULA: return createMatricula();
			case Framework_matriculaPackage.ALUNO_BOLSISTA: return createAlunoBolsista();
			case Framework_matriculaPackage.ALUNO_COMUM: return createAlunoComum();
			case Framework_matriculaPackage.TIPO_MATRICULA: return createTipoMatricula();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Disciplina createDisciplina() {
		DisciplinaImpl disciplina = new DisciplinaImpl();
		return disciplina;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Matricula createMatricula() {
		MatriculaImpl matricula = new MatriculaImpl();
		return matricula;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlunoBolsista createAlunoBolsista() {
		AlunoBolsistaImpl alunoBolsista = new AlunoBolsistaImpl();
		return alunoBolsista;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlunoComum createAlunoComum() {
		AlunoComumImpl alunoComum = new AlunoComumImpl();
		return alunoComum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TipoMatricula createTipoMatricula() {
		TipoMatriculaImpl tipoMatricula = new TipoMatriculaImpl();
		return tipoMatricula;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Framework_matriculaPackage getFramework_matriculaPackage() {
		return (Framework_matriculaPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Framework_matriculaPackage getPackage() {
		return Framework_matriculaPackage.eINSTANCE;
	}

} //Framework_matriculaFactoryImpl
