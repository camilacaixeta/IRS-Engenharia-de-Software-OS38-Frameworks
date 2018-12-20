/**
 */
package framework_matricula.util;

import framework_matricula.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see framework_matricula.Framework_matriculaPackage
 * @generated
 */
public class Framework_matriculaAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Framework_matriculaPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Framework_matriculaAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Framework_matriculaPackage.eINSTANCE;
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
	protected Framework_matriculaSwitch<Adapter> modelSwitch =
		new Framework_matriculaSwitch<Adapter>() {
			@Override
			public Adapter caseDisciplina(Disciplina object) {
				return createDisciplinaAdapter();
			}
			@Override
			public Adapter caseMatricula(Matricula object) {
				return createMatriculaAdapter();
			}
			@Override
			public Adapter caseAluno(Aluno object) {
				return createAlunoAdapter();
			}
			@Override
			public Adapter caseAlunoBolsista(AlunoBolsista object) {
				return createAlunoBolsistaAdapter();
			}
			@Override
			public Adapter caseAlunoComum(AlunoComum object) {
				return createAlunoComumAdapter();
			}
			@Override
			public Adapter caseTipoMatricula(TipoMatricula object) {
				return createTipoMatriculaAdapter();
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
	 * Creates a new adapter for an object of class '{@link framework_matricula.Disciplina <em>Disciplina</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see framework_matricula.Disciplina
	 * @generated
	 */
	public Adapter createDisciplinaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link framework_matricula.Matricula <em>Matricula</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see framework_matricula.Matricula
	 * @generated
	 */
	public Adapter createMatriculaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link framework_matricula.Aluno <em>Aluno</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see framework_matricula.Aluno
	 * @generated
	 */
	public Adapter createAlunoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link framework_matricula.AlunoBolsista <em>Aluno Bolsista</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see framework_matricula.AlunoBolsista
	 * @generated
	 */
	public Adapter createAlunoBolsistaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link framework_matricula.AlunoComum <em>Aluno Comum</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see framework_matricula.AlunoComum
	 * @generated
	 */
	public Adapter createAlunoComumAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link framework_matricula.TipoMatricula <em>Tipo Matricula</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see framework_matricula.TipoMatricula
	 * @generated
	 */
	public Adapter createTipoMatriculaAdapter() {
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

} //Framework_matriculaAdapterFactory
