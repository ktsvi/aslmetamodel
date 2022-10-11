/**
 */
package eclipse.emf.abmodel.model.abmodel.impl;

import eclipse.emf.abmodel.model.abmodel.*;

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
public class AbmodelFactoryImpl extends EFactoryImpl implements AbmodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AbmodelFactory init() {
		try {
			AbmodelFactory theAbmodelFactory = (AbmodelFactory)EPackage.Registry.INSTANCE.getEFactory(AbmodelPackage.eNS_URI);
			if (theAbmodelFactory != null) {
				return theAbmodelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AbmodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbmodelFactoryImpl() {
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
			case AbmodelPackage.AB_MODEL: return createABModel();
			case AbmodelPackage.AGENT_BLOCK: return createAgentBlock();
			case AbmodelPackage.SIMPLE_PLAN: return createsimplePlan();
			case AbmodelPackage.GLOBAL_BLOCK: return createGlobalBlock();
			case AbmodelPackage.GLOBAL_VARIABLE: return createGlobalVariable();
			case AbmodelPackage.PARAMETER: return createParameter();
			case AbmodelPackage.OUTPUT: return createOutput();
			case AbmodelPackage.DISPLAY: return createDisplay();
			case AbmodelPackage.PLAN: return createPlan();
			case AbmodelPackage.MONITOR: return createMonitor();
			case AbmodelPackage.EXPERIMENT_BLOCK: return createExperimentBlock();
			case AbmodelPackage.REFLEX: return createReflex();
			case AbmodelPackage.COMPLEXE_PLAN: return createComplexePlan();
			case AbmodelPackage.EXPORT_FILE: return createExportFile();
			case AbmodelPackage.INSPECTOR: return createInspector();
			case AbmodelPackage.PROPERTY: return createProperty();
			case AbmodelPackage.SPATIAL_ENTITY: return createSpatialEntity();
			case AbmodelPackage.POLYGON: return createPolygon();
			case AbmodelPackage.LINE: return createLine();
			case AbmodelPackage.POINT: return createPoint();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ABModel createABModel() {
		ABModelImpl abModel = new ABModelImpl();
		return abModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AgentBlock createAgentBlock() {
		AgentBlockImpl agentBlock = new AgentBlockImpl();
		return agentBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public simplePlan createsimplePlan() {
		simplePlanImpl simplePlan = new simplePlanImpl();
		return simplePlan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalBlock createGlobalBlock() {
		GlobalBlockImpl globalBlock = new GlobalBlockImpl();
		return globalBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalVariable createGlobalVariable() {
		GlobalVariableImpl globalVariable = new GlobalVariableImpl();
		return globalVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Output createOutput() {
		OutputImpl output = new OutputImpl();
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Display createDisplay() {
		DisplayImpl display = new DisplayImpl();
		return display;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Plan createPlan() {
		PlanImpl plan = new PlanImpl();
		return plan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Monitor createMonitor() {
		MonitorImpl monitor = new MonitorImpl();
		return monitor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExperimentBlock createExperimentBlock() {
		ExperimentBlockImpl experimentBlock = new ExperimentBlockImpl();
		return experimentBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reflex createReflex() {
		ReflexImpl reflex = new ReflexImpl();
		return reflex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComplexePlan createComplexePlan() {
		ComplexePlanImpl complexePlan = new ComplexePlanImpl();
		return complexePlan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExportFile createExportFile() {
		ExportFileImpl exportFile = new ExportFileImpl();
		return exportFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Inspector createInspector() {
		InspectorImpl inspector = new InspectorImpl();
		return inspector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property createProperty() {
		PropertyImpl property = new PropertyImpl();
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpatialEntity createSpatialEntity() {
		SpatialEntityImpl spatialEntity = new SpatialEntityImpl();
		return spatialEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Polygon createPolygon() {
		PolygonImpl polygon = new PolygonImpl();
		return polygon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Line createLine() {
		LineImpl line = new LineImpl();
		return line;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Point createPoint() {
		PointImpl point = new PointImpl();
		return point;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbmodelPackage getAbmodelPackage() {
		return (AbmodelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AbmodelPackage getPackage() {
		return AbmodelPackage.eINSTANCE;
	}

} //AbmodelFactoryImpl
