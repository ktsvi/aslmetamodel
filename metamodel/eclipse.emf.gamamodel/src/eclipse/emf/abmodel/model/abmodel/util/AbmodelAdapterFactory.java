/**
 */
package eclipse.emf.abmodel.model.abmodel.util;

import eclipse.emf.abmodel.model.abmodel.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see eclipse.emf.abmodel.model.abmodel.AbmodelPackage
 * @generated
 */
public class AbmodelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AbmodelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbmodelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = AbmodelPackage.eINSTANCE;
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
	protected AbmodelSwitch<Adapter> modelSwitch =
		new AbmodelSwitch<Adapter>() {
			@Override
			public Adapter caseABModel(ABModel object) {
				return createABModelAdapter();
			}
			@Override
			public Adapter caseAgentBlock(AgentBlock object) {
				return createAgentBlockAdapter();
			}
			@Override
			public Adapter casesimplePlan(simplePlan object) {
				return createsimplePlanAdapter();
			}
			@Override
			public Adapter caseGlobalBlock(GlobalBlock object) {
				return createGlobalBlockAdapter();
			}
			@Override
			public Adapter caseGlobalVariable(GlobalVariable object) {
				return createGlobalVariableAdapter();
			}
			@Override
			public Adapter caseParameter(Parameter object) {
				return createParameterAdapter();
			}
			@Override
			public Adapter caseOutput(Output object) {
				return createOutputAdapter();
			}
			@Override
			public Adapter caseDisplay(Display object) {
				return createDisplayAdapter();
			}
			@Override
			public Adapter casePlan(Plan object) {
				return createPlanAdapter();
			}
			@Override
			public Adapter caseMonitor(Monitor object) {
				return createMonitorAdapter();
			}
			@Override
			public Adapter caseExperimentBlock(ExperimentBlock object) {
				return createExperimentBlockAdapter();
			}
			@Override
			public Adapter caseReflex(Reflex object) {
				return createReflexAdapter();
			}
			@Override
			public Adapter caseComplexePlan(ComplexePlan object) {
				return createComplexePlanAdapter();
			}
			@Override
			public Adapter caseExportFile(ExportFile object) {
				return createExportFileAdapter();
			}
			@Override
			public Adapter caseInspector(Inspector object) {
				return createInspectorAdapter();
			}
			@Override
			public Adapter caseProperty(Property object) {
				return createPropertyAdapter();
			}
			@Override
			public Adapter caseSpatialEntity(SpatialEntity object) {
				return createSpatialEntityAdapter();
			}
			@Override
			public Adapter casePolygon(Polygon object) {
				return createPolygonAdapter();
			}
			@Override
			public Adapter caseLine(Line object) {
				return createLineAdapter();
			}
			@Override
			public Adapter casePoint(Point object) {
				return createPointAdapter();
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
	 * Creates a new adapter for an object of class '{@link eclipse.emf.abmodel.model.abmodel.ABModel <em>AB Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eclipse.emf.abmodel.model.abmodel.ABModel
	 * @generated
	 */
	public Adapter createABModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eclipse.emf.abmodel.model.abmodel.AgentBlock <em>Agent Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eclipse.emf.abmodel.model.abmodel.AgentBlock
	 * @generated
	 */
	public Adapter createAgentBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eclipse.emf.abmodel.model.abmodel.simplePlan <em>simple Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eclipse.emf.abmodel.model.abmodel.simplePlan
	 * @generated
	 */
	public Adapter createsimplePlanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eclipse.emf.abmodel.model.abmodel.GlobalBlock <em>Global Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eclipse.emf.abmodel.model.abmodel.GlobalBlock
	 * @generated
	 */
	public Adapter createGlobalBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eclipse.emf.abmodel.model.abmodel.GlobalVariable <em>Global Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eclipse.emf.abmodel.model.abmodel.GlobalVariable
	 * @generated
	 */
	public Adapter createGlobalVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eclipse.emf.abmodel.model.abmodel.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eclipse.emf.abmodel.model.abmodel.Parameter
	 * @generated
	 */
	public Adapter createParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eclipse.emf.abmodel.model.abmodel.Output <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eclipse.emf.abmodel.model.abmodel.Output
	 * @generated
	 */
	public Adapter createOutputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eclipse.emf.abmodel.model.abmodel.Display <em>Display</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eclipse.emf.abmodel.model.abmodel.Display
	 * @generated
	 */
	public Adapter createDisplayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eclipse.emf.abmodel.model.abmodel.Plan <em>Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eclipse.emf.abmodel.model.abmodel.Plan
	 * @generated
	 */
	public Adapter createPlanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eclipse.emf.abmodel.model.abmodel.Monitor <em>Monitor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eclipse.emf.abmodel.model.abmodel.Monitor
	 * @generated
	 */
	public Adapter createMonitorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eclipse.emf.abmodel.model.abmodel.ExperimentBlock <em>Experiment Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eclipse.emf.abmodel.model.abmodel.ExperimentBlock
	 * @generated
	 */
	public Adapter createExperimentBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eclipse.emf.abmodel.model.abmodel.Reflex <em>Reflex</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eclipse.emf.abmodel.model.abmodel.Reflex
	 * @generated
	 */
	public Adapter createReflexAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eclipse.emf.abmodel.model.abmodel.ComplexePlan <em>Complexe Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eclipse.emf.abmodel.model.abmodel.ComplexePlan
	 * @generated
	 */
	public Adapter createComplexePlanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eclipse.emf.abmodel.model.abmodel.ExportFile <em>Export File</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eclipse.emf.abmodel.model.abmodel.ExportFile
	 * @generated
	 */
	public Adapter createExportFileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eclipse.emf.abmodel.model.abmodel.Inspector <em>Inspector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eclipse.emf.abmodel.model.abmodel.Inspector
	 * @generated
	 */
	public Adapter createInspectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eclipse.emf.abmodel.model.abmodel.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eclipse.emf.abmodel.model.abmodel.Property
	 * @generated
	 */
	public Adapter createPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eclipse.emf.abmodel.model.abmodel.SpatialEntity <em>Spatial Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eclipse.emf.abmodel.model.abmodel.SpatialEntity
	 * @generated
	 */
	public Adapter createSpatialEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eclipse.emf.abmodel.model.abmodel.Polygon <em>Polygon</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eclipse.emf.abmodel.model.abmodel.Polygon
	 * @generated
	 */
	public Adapter createPolygonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eclipse.emf.abmodel.model.abmodel.Line <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eclipse.emf.abmodel.model.abmodel.Line
	 * @generated
	 */
	public Adapter createLineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eclipse.emf.abmodel.model.abmodel.Point <em>Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eclipse.emf.abmodel.model.abmodel.Point
	 * @generated
	 */
	public Adapter createPointAdapter() {
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

} //AbmodelAdapterFactory
