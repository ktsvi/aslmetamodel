/**
 */
package eclipse.emf.abmodel.model.abmodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see eclipse.emf.abmodel.model.abmodel.AbmodelFactory
 * @model kind="package"
 * @generated
 */
public interface AbmodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "abmodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://ASL/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "abmodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AbmodelPackage eINSTANCE = eclipse.emf.abmodel.model.abmodel.impl.AbmodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link eclipse.emf.abmodel.model.abmodel.impl.ABModelImpl <em>AB Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eclipse.emf.abmodel.model.abmodel.impl.ABModelImpl
	 * @see eclipse.emf.abmodel.model.abmodel.impl.AbmodelPackageImpl#getABModel()
	 * @generated
	 */
	int AB_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Contains G</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AB_MODEL__CONTAINS_G = 0;

	/**
	 * The feature id for the '<em><b>Contains S</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AB_MODEL__CONTAINS_S = 1;

	/**
	 * The feature id for the '<em><b>Contains E</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AB_MODEL__CONTAINS_E = 2;

	/**
	 * The feature id for the '<em><b>Model Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AB_MODEL__MODEL_NAME = 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AB_MODEL__DESCRIPTION = 4;

	/**
	 * The feature id for the '<em><b>Keywords</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AB_MODEL__KEYWORDS = 5;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AB_MODEL__AUTHOR = 6;

	/**
	 * The feature id for the '<em><b>Create On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AB_MODEL__CREATE_ON = 7;

	/**
	 * The number of structural features of the '<em>AB Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AB_MODEL_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>AB Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AB_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eclipse.emf.abmodel.model.abmodel.impl.AgentBlockImpl <em>Agent Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eclipse.emf.abmodel.model.abmodel.impl.AgentBlockImpl
	 * @see eclipse.emf.abmodel.model.abmodel.impl.AbmodelPackageImpl#getAgentBlock()
	 * @generated
	 */
	int AGENT_BLOCK = 1;

	/**
	 * The feature id for the '<em><b>Has P</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_BLOCK__HAS_P = 0;

	/**
	 * The feature id for the '<em><b>Has Pr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_BLOCK__HAS_PR = 1;

	/**
	 * The feature id for the '<em><b>Name Agent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_BLOCK__NAME_AGENT = 2;

	/**
	 * The feature id for the '<em><b>Aspect Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_BLOCK__ASPECT_NAME = 3;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_BLOCK__COLOR = 4;

	/**
	 * The feature id for the '<em><b>Init</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_BLOCK__INIT = 5;

	/**
	 * The feature id for the '<em><b>Aspect Function</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_BLOCK__ASPECT_FUNCTION = 6;

	/**
	 * The feature id for the '<em><b>Agent Architecture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_BLOCK__AGENT_ARCHITECTURE = 7;

	/**
	 * The feature id for the '<em><b>Skillofagent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_BLOCK__SKILLOFAGENT = 8;

	/**
	 * The number of structural features of the '<em>Agent Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_BLOCK_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Agent Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_BLOCK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eclipse.emf.abmodel.model.abmodel.impl.PlanImpl <em>Plan</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eclipse.emf.abmodel.model.abmodel.impl.PlanImpl
	 * @see eclipse.emf.abmodel.model.abmodel.impl.AbmodelPackageImpl#getPlan()
	 * @generated
	 */
	int PLAN = 8;

	/**
	 * The feature id for the '<em><b>Plan Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN__PLAN_NAME = 0;

	/**
	 * The feature id for the '<em><b>Intention</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN__INTENTION = 1;

	/**
	 * The number of structural features of the '<em>Plan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Plan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eclipse.emf.abmodel.model.abmodel.impl.simplePlanImpl <em>simple Plan</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eclipse.emf.abmodel.model.abmodel.impl.simplePlanImpl
	 * @see eclipse.emf.abmodel.model.abmodel.impl.AbmodelPackageImpl#getsimplePlan()
	 * @generated
	 */
	int SIMPLE_PLAN = 2;

	/**
	 * The feature id for the '<em><b>Plan Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_PLAN__PLAN_NAME = PLAN__PLAN_NAME;

	/**
	 * The feature id for the '<em><b>Intention</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_PLAN__INTENTION = PLAN__INTENTION;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_PLAN__RETURN_TYPE = PLAN_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>simple Plan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_PLAN_FEATURE_COUNT = PLAN_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>simple Plan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_PLAN_OPERATION_COUNT = PLAN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eclipse.emf.abmodel.model.abmodel.impl.GlobalBlockImpl <em>Global Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eclipse.emf.abmodel.model.abmodel.impl.GlobalBlockImpl
	 * @see eclipse.emf.abmodel.model.abmodel.impl.AbmodelPackageImpl#getGlobalBlock()
	 * @generated
	 */
	int GLOBAL_BLOCK = 3;

	/**
	 * The feature id for the '<em><b>Contains Gl</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_BLOCK__CONTAINS_GL = 0;

	/**
	 * The feature id for the '<em><b>Contains SE</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_BLOCK__CONTAINS_SE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_BLOCK__ID = 2;

	/**
	 * The feature id for the '<em><b>Init</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_BLOCK__INIT = 3;

	/**
	 * The number of structural features of the '<em>Global Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_BLOCK_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Global Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_BLOCK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eclipse.emf.abmodel.model.abmodel.impl.GlobalVariableImpl <em>Global Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eclipse.emf.abmodel.model.abmodel.impl.GlobalVariableImpl
	 * @see eclipse.emf.abmodel.model.abmodel.impl.AbmodelPackageImpl#getGlobalVariable()
	 * @generated
	 */
	int GLOBAL_VARIABLE = 4;

	/**
	 * The feature id for the '<em><b>Init</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_VARIABLE__INIT = 0;

	/**
	 * The feature id for the '<em><b>Gvar Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_VARIABLE__GVAR_NAME = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_VARIABLE__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Init Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_VARIABLE__INIT_VALUE = 3;

	/**
	 * The number of structural features of the '<em>Global Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_VARIABLE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Global Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_VARIABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eclipse.emf.abmodel.model.abmodel.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eclipse.emf.abmodel.model.abmodel.impl.ParameterImpl
	 * @see eclipse.emf.abmodel.model.abmodel.impl.AbmodelPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 5;

	/**
	 * The feature id for the '<em><b>Param Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__PARAM_NAME = 0;

	/**
	 * The feature id for the '<em><b>Target Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__TARGET_VARIABLE = 1;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eclipse.emf.abmodel.model.abmodel.impl.OutputImpl <em>Output</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eclipse.emf.abmodel.model.abmodel.impl.OutputImpl
	 * @see eclipse.emf.abmodel.model.abmodel.impl.AbmodelPackageImpl#getOutput()
	 * @generated
	 */
	int OUTPUT = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__ID = 0;

	/**
	 * The feature id for the '<em><b>Has M</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__HAS_M = 1;

	/**
	 * The feature id for the '<em><b>Contains D</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__CONTAINS_D = 2;

	/**
	 * The feature id for the '<em><b>Has EF</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__HAS_EF = 3;

	/**
	 * The feature id for the '<em><b>Has I</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__HAS_I = 4;

	/**
	 * The number of structural features of the '<em>Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eclipse.emf.abmodel.model.abmodel.impl.DisplayImpl <em>Display</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eclipse.emf.abmodel.model.abmodel.impl.DisplayImpl
	 * @see eclipse.emf.abmodel.model.abmodel.impl.AbmodelPackageImpl#getDisplay()
	 * @generated
	 */
	int DISPLAY = 7;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY__DISPLAY_NAME = 0;

	/**
	 * The feature id for the '<em><b>Display Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY__DISPLAY_TYPE = 1;

	/**
	 * The number of structural features of the '<em>Display</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Display</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eclipse.emf.abmodel.model.abmodel.impl.MonitorImpl <em>Monitor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eclipse.emf.abmodel.model.abmodel.impl.MonitorImpl
	 * @see eclipse.emf.abmodel.model.abmodel.impl.AbmodelPackageImpl#getMonitor()
	 * @generated
	 */
	int MONITOR = 9;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITOR__LABEL = 0;

	/**
	 * The feature id for the '<em><b>Target Var</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITOR__TARGET_VAR = 1;

	/**
	 * The number of structural features of the '<em>Monitor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITOR_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Monitor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eclipse.emf.abmodel.model.abmodel.impl.ExperimentBlockImpl <em>Experiment Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eclipse.emf.abmodel.model.abmodel.impl.ExperimentBlockImpl
	 * @see eclipse.emf.abmodel.model.abmodel.impl.AbmodelPackageImpl#getExperimentBlock()
	 * @generated
	 */
	int EXPERIMENT_BLOCK = 10;

	/**
	 * The feature id for the '<em><b>Has Pa</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENT_BLOCK__HAS_PA = 0;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENT_BLOCK__OUTPUT = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENT_BLOCK__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Exp Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENT_BLOCK__EXP_NAME = 3;

	/**
	 * The number of structural features of the '<em>Experiment Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENT_BLOCK_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Experiment Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENT_BLOCK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eclipse.emf.abmodel.model.abmodel.impl.ReflexImpl <em>Reflex</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eclipse.emf.abmodel.model.abmodel.impl.ReflexImpl
	 * @see eclipse.emf.abmodel.model.abmodel.impl.AbmodelPackageImpl#getReflex()
	 * @generated
	 */
	int REFLEX = 11;

	/**
	 * The feature id for the '<em><b>Plan Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFLEX__PLAN_NAME = PLAN__PLAN_NAME;

	/**
	 * The feature id for the '<em><b>Intention</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFLEX__INTENTION = PLAN__INTENTION;

	/**
	 * The feature id for the '<em><b>Exist Reflex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFLEX__EXIST_REFLEX = PLAN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Goal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFLEX__GOAL = PLAN_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Reflex</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFLEX_FEATURE_COUNT = PLAN_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Reflex</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFLEX_OPERATION_COUNT = PLAN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eclipse.emf.abmodel.model.abmodel.impl.ComplexePlanImpl <em>Complexe Plan</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eclipse.emf.abmodel.model.abmodel.impl.ComplexePlanImpl
	 * @see eclipse.emf.abmodel.model.abmodel.impl.AbmodelPackageImpl#getComplexePlan()
	 * @generated
	 */
	int COMPLEXE_PLAN = 12;

	/**
	 * The feature id for the '<em><b>Plan Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEXE_PLAN__PLAN_NAME = PLAN__PLAN_NAME;

	/**
	 * The feature id for the '<em><b>Intention</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEXE_PLAN__INTENTION = PLAN__INTENTION;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEXE_PLAN__RETURN_TYPE = PLAN_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Complexe Plan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEXE_PLAN_FEATURE_COUNT = PLAN_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Complexe Plan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEXE_PLAN_OPERATION_COUNT = PLAN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eclipse.emf.abmodel.model.abmodel.impl.ExportFileImpl <em>Export File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eclipse.emf.abmodel.model.abmodel.impl.ExportFileImpl
	 * @see eclipse.emf.abmodel.model.abmodel.impl.AbmodelPackageImpl#getExportFile()
	 * @generated
	 */
	int EXPORT_FILE = 13;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORT_FILE__FILE_NAME = 0;

	/**
	 * The number of structural features of the '<em>Export File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORT_FILE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Export File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORT_FILE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eclipse.emf.abmodel.model.abmodel.impl.InspectorImpl <em>Inspector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eclipse.emf.abmodel.model.abmodel.impl.InspectorImpl
	 * @see eclipse.emf.abmodel.model.abmodel.impl.AbmodelPackageImpl#getInspector()
	 * @generated
	 */
	int INSPECTOR = 14;

	/**
	 * The feature id for the '<em><b>Inspector Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSPECTOR__INSPECTOR_NAME = 0;

	/**
	 * The feature id for the '<em><b>Agent Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSPECTOR__AGENT_VALUE = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSPECTOR__TYPE = 2;

	/**
	 * The number of structural features of the '<em>Inspector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSPECTOR_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Inspector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSPECTOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eclipse.emf.abmodel.model.abmodel.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eclipse.emf.abmodel.model.abmodel.impl.PropertyImpl
	 * @see eclipse.emf.abmodel.model.abmodel.impl.AbmodelPackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 15;

	/**
	 * The feature id for the '<em><b>Nameofvariable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__NAMEOFVARIABLE = 0;

	/**
	 * The feature id for the '<em><b>Associate Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__ASSOCIATE_VALUE = 1;

	/**
	 * The feature id for the '<em><b>Default Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__DEFAULT_TYPE = 2;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eclipse.emf.abmodel.model.abmodel.impl.SpatialEntityImpl <em>Spatial Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eclipse.emf.abmodel.model.abmodel.impl.SpatialEntityImpl
	 * @see eclipse.emf.abmodel.model.abmodel.impl.AbmodelPackageImpl#getSpatialEntity()
	 * @generated
	 */
	int SPATIAL_ENTITY = 16;

	/**
	 * The feature id for the '<em><b>Shape Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPATIAL_ENTITY__SHAPE_NAME = 0;

	/**
	 * The feature id for the '<em><b>Shape Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPATIAL_ENTITY__SHAPE_PATH = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPATIAL_ENTITY__TYPE = 2;

	/**
	 * The number of structural features of the '<em>Spatial Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPATIAL_ENTITY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Spatial Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPATIAL_ENTITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eclipse.emf.abmodel.model.abmodel.impl.PolygonImpl <em>Polygon</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eclipse.emf.abmodel.model.abmodel.impl.PolygonImpl
	 * @see eclipse.emf.abmodel.model.abmodel.impl.AbmodelPackageImpl#getPolygon()
	 * @generated
	 */
	int POLYGON = 17;

	/**
	 * The feature id for the '<em><b>Shape Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON__SHAPE_NAME = SPATIAL_ENTITY__SHAPE_NAME;

	/**
	 * The feature id for the '<em><b>Shape Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON__SHAPE_PATH = SPATIAL_ENTITY__SHAPE_PATH;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON__TYPE = SPATIAL_ENTITY__TYPE;

	/**
	 * The number of structural features of the '<em>Polygon</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_FEATURE_COUNT = SPATIAL_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Polygon</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_OPERATION_COUNT = SPATIAL_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eclipse.emf.abmodel.model.abmodel.impl.LineImpl <em>Line</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eclipse.emf.abmodel.model.abmodel.impl.LineImpl
	 * @see eclipse.emf.abmodel.model.abmodel.impl.AbmodelPackageImpl#getLine()
	 * @generated
	 */
	int LINE = 18;

	/**
	 * The feature id for the '<em><b>Shape Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__SHAPE_NAME = SPATIAL_ENTITY__SHAPE_NAME;

	/**
	 * The feature id for the '<em><b>Shape Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__SHAPE_PATH = SPATIAL_ENTITY__SHAPE_PATH;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__TYPE = SPATIAL_ENTITY__TYPE;

	/**
	 * The number of structural features of the '<em>Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_FEATURE_COUNT = SPATIAL_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_OPERATION_COUNT = SPATIAL_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eclipse.emf.abmodel.model.abmodel.impl.PointImpl <em>Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eclipse.emf.abmodel.model.abmodel.impl.PointImpl
	 * @see eclipse.emf.abmodel.model.abmodel.impl.AbmodelPackageImpl#getPoint()
	 * @generated
	 */
	int POINT = 19;

	/**
	 * The feature id for the '<em><b>Shape Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT__SHAPE_NAME = SPATIAL_ENTITY__SHAPE_NAME;

	/**
	 * The feature id for the '<em><b>Shape Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT__SHAPE_PATH = SPATIAL_ENTITY__SHAPE_PATH;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT__TYPE = SPATIAL_ENTITY__TYPE;

	/**
	 * The number of structural features of the '<em>Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_FEATURE_COUNT = SPATIAL_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_OPERATION_COUNT = SPATIAL_ENTITY_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link eclipse.emf.abmodel.model.abmodel.ABModel <em>AB Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AB Model</em>'.
	 * @see eclipse.emf.abmodel.model.abmodel.ABModel
	 * @generated
	 */
	EClass getABModel();

	/**
	 * Returns the meta object for the containment reference '{@link eclipse.emf.abmodel.model.abmodel.ABModel#getContainsG <em>Contains G</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Contains G</em>'.
	 * @see eclipse.emf.abmodel.model.abmodel.ABModel#getContainsG()
	 * @see #getABModel()
	 * @generated
	 */
	EReference getABModel_ContainsG();

	/**
	 * Returns the meta object for the containment reference list '{@link eclipse.emf.abmodel.model.abmodel.ABModel#getContainsS <em>Contains S</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains S</em>'.
	 * @see eclipse.emf.abmodel.model.abmodel.ABModel#getContainsS()
	 * @see #getABModel()
	 * @generated
	 */
	EReference getABModel_ContainsS();

	/**
	 * Returns the meta object for the containment reference list '{@link eclipse.emf.abmodel.model.abmodel.ABModel#getContainsE <em>Contains E</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains E</em>'.
	 * @see eclipse.emf.abmodel.model.abmodel.ABModel#getContainsE()
	 * @see #getABModel()
	 * @generated
	 */
	EReference getABModel_ContainsE();

	/**
	 * Returns the meta object for the attribute '{@link eclipse.emf.abmodel.model.abmodel.ABModel#getModelName <em>Model Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model Name</em>'.
	 * @see eclipse.emf.abmodel.model.abmodel.ABModel#getModelName()
	 * @see #getABModel()
	 * @generated
	 */
	EAttribute getABModel_ModelName();

	/**
	 * Returns the meta object for the attribute '{@link eclipse.emf.abmodel.model.abmodel.ABModel#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see eclipse.emf.abmodel.model.abmodel.ABModel#getDescription()
	 * @see #getABModel()
	 * @generated
	 */
	EAttribute getABModel_Description();

	/**
	 * Returns the meta object for the attribute '{@link eclipse.emf.abmodel.model.abmodel.ABModel#getKeywords <em>Keywords</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Keywords</em>'.
	 * @see eclipse.emf.abmodel.model.abmodel.ABModel#getKeywords()
	 * @see #getABModel()
	 * @generated
	 */
	EAttribute getABModel_Keywords();

	/**
	 * Returns the meta object for the attribute '{@link eclipse.emf.abmodel.model.abmodel.ABModel#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Author</em>'.
	 * @see eclipse.emf.abmodel.model.abmodel.ABModel#getAuthor()
	 * @see #getABModel()
	 * @generated
	 */
	EAttribute getABModel_Author();

	/**
	 * Returns the meta object for the attribute '{@link eclipse.emf.abmodel.model.abmodel.ABModel#getCreateOn <em>Create On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Create On</em>'.
	 * @see eclipse.emf.abmodel.model.abmodel.ABModel#getCreateOn()
	 * @see #getABModel()
	 * @generated
	 */
	EAttribute getABModel_CreateOn();

	/**
	 * Returns the meta object for class '{@link eclipse.emf.abmodel.model.abmodel.AgentBlock <em>Agent Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Agent Block</em>'.
	 * @see eclipse.emf.abmodel.model.abmodel.AgentBlock
	 * @generated
	 */
	EClass getAgentBlock();

	/**
	 * Returns the meta object for the containment reference list '{@link eclipse.emf.abmodel.model.abmodel.AgentBlock#getHasP <em>Has P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has P</em>'.
	 * @see eclipse.emf.abmodel.model.abmodel.AgentBlock#getHasP()
	 * @see #getAgentBlock()
	 * @generated
	 */
	EReference getAgentBlock_HasP();

	/**
	 * Returns the meta object for the containment reference list '{@link eclipse.emf.abmodel.model.abmodel.AgentBlock#getHasPr <em>Has Pr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Pr</em>'.
	 * @see eclipse.emf.abmodel.model.abmodel.AgentBlock#getHasPr()
	 * @see #getAgentBlock()
	 * @generated
	 */
	EReference getAgentBlock_HasPr();

	/**
	 * Returns the meta object for the attribute '{@link eclipse.emf.abmodel.model.abmodel.AgentBlock#getNameAgent <em>Name Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Agent</em>'.
	 * @see eclipse.emf.abmodel.model.abmodel.AgentBlock#getNameAgent()
	 * @see #getAgentBlock()
	 * @generated
	 */
	EAttribute getAgentBlock_NameAgent();

	/**
	 * Returns the meta object for the attribute '{@link eclipse.emf.abmodel.model.abmodel.AgentBlock#getAspectName <em>Aspect Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aspect Name</em>'.
	 * @see eclipse.emf.abmodel.model.abmodel.AgentBlock#getAspectName()
	 * @see #getAgentBlock()
	 * @generated
	 */
	EAttribute getAgentBlock_AspectName();

	/**
	 * Returns the meta object for the attribute '{@link eclipse.emf.abmodel.model.abmodel.AgentBlock#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see eclipse.emf.abmodel.model.abmodel.AgentBlock#getColor()
	 * @see #getAgentBlock()
	 * @generated
	 */
	EAttribute getAgentBlock_Color();

	/**
	 * Returns the meta object for the attribute '{@link eclipse.emf.abmodel.model.abmodel.AgentBlock#isInit <em>Init</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Init</em>'.
	 * @see eclipse.emf.abmodel.model.abmodel.AgentBlock#isInit()
	 * @see #getAgentBlock()
	 * @generated
	 */
	EAttribute getAgentBlock_Init();

	/**
	 * Returns the meta object for the attribute '{@link eclipse.emf.abmodel.model.abmodel.AgentBlock#isAspectFunction <em>Aspect Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aspect Function</em>'.
	 * @see eclipse.emf.abmodel.model.abmodel.AgentBlock#isAspectFunction()
	 * @see #getAgentBlock()
	 * @generated
	 */
	EAttribute getAgentBlock_AspectFunction();

	/**
	 * Returns the meta object for the attribute '{@link eclipse.emf.abmodel.model.abmodel.AgentBlock#getAgentArchitecture <em>Agent Architecture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Agent Architecture</em>'.
	 * @see eclipse.emf.abmodel.model.abmodel.AgentBlock#getAgentArchitecture()
	 * @see #getAgentBlock()
	 * @generated
	 */
	EAttribute getAgentBlock_AgentArchitecture();

	/**
	 * Returns the meta object for the attribute '{@link eclipse.emf.abmodel.model.abmodel.AgentBlock#getSkillofagent <em>Skillofagent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Skillofagent</em>'.
	 * @see eclipse.emf.abmodel.model.abmodel.AgentBlock#getSkillofagent()
	 * @see #getAgentBlock()
	 * @generated
	 */
	EAttribute getAgentBlock_Skillofagent();

	/**
	 * Returns the meta object for class '{@link eclipse.emf.abmodel.model.abmodel.simplePlan <em>simple Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>simple Plan</em>'.
	 * @see eclipse.emf.abmodel.model.abmodel.simplePlan
	 * @generated
	 */
	EClass getsimplePlan();

	/**
	 * Returns the meta object for the attribute '{@link eclipse.emf.abmodel.model.abmodel.simplePlan#getReturnType <em>Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return Type</em>'.
	 * @see eclipse.emf.abmodel.model.abmodel.simplePlan#getReturnType()
	 * @see #getsimplePlan()
	 * @generated
	 */
	EAttribute getsimplePlan_ReturnType();

	/**
	 * Returns the meta object for class '{@link eclipse.emf.abmodel.model.abmodel.GlobalBlock <em>Global Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Global Block</em>'.
	 * @see eclipse.emf.abmodel.model.abmodel.GlobalBlock
	 * @generated
	 */
	EClass getGlobalBlock();

	/**
	 * Returns the meta object for the containment reference list '{@link eclipse.emf.abmodel.model.abmodel.GlobalBlock#getContainsGl <em>Contains Gl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains Gl</em>'.
	 * @see eclipse.emf.abmodel.model.abmodel.GlobalBlock#getContainsGl()
	 * @see #getGlobalBlock()
	 * @generated
	 */
	EReference getGlobalBlock_ContainsGl();

	/**
	 * Returns the meta object for the containment reference list '{@link eclipse.emf.abmodel.model.abmodel.GlobalBlock#getContainsSE <em>Contains SE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains SE</em>'.
	 * @see eclipse.emf.abmodel.model.abmodel.GlobalBlock#getContainsSE()
	 * @see #getGlobalBlock()
	 * @generated
	 */
	EReference getGlobalBlock_ContainsSE();

	/**
	 * Returns the meta object for the attribute '{@link eclipse.emf.abmodel.model.abmodel.GlobalBlock#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see eclipse.emf.abmodel.model.abmodel.GlobalBlock#getId()
	 * @see #getGlobalBlock()
	 * @generated
	 */
	EAttribute getGlobalBlock_Id();

	/**
	 * Returns the meta object for the attribute '{@link eclipse.emf.abmodel.model.abmodel.GlobalBlock#isInit <em>Init</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Init</em>'.
	 * @see eclipse.emf.abmodel.model.abmodel.GlobalBlock#isInit()
	 * @see #getGlobalBlock()
	 * @generated
	 */
	EAttribute getGlobalBlock_Init();

	/**
	 * Returns the meta object for class '{@link eclipse.emf.abmodel.model.abmodel.GlobalVariable <em>Global Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Global Variable</em>'.
	 * @see eclipse.emf.abmodel.model.abmodel.GlobalVariable
	 * @generated
	 */
	EClass getGlobalVariable();

	/**
	 * Returns the meta object for the attribute '{@link eclipse.emf.abmodel.model.abmodel.GlobalVariable#isInit <em>Init</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Init</em>'.
	 * @see eclipse.emf.abmodel.model.abmodel.GlobalVariable#isInit()
	 * @see #getGlobalVariable()
	 * @generated
	 */
	EAttribute getGlobalVariable_Init();

	/**
	 * Returns the meta object for the attribute '{@link eclipse.emf.abmodel.model.abmodel.GlobalVariable#getGvarName <em>Gvar Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gvar Name</em>'.
	 * @see eclipse.emf.abmodel.model.abmodel.GlobalVariable#getGvarName()
	 * @see #getGlobalVariable()
	 * @generated
	 */
	EAttribute getGlobalVariable_GvarName();

	/**
	 * Returns the meta object for the attribute '{@link eclipse.emf.abmodel.model.abmodel.GlobalVariable#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see eclipse.emf.abmodel.model.abmodel.GlobalVariable#getType()
	 * @see #getGlobalVariable()
	 * @generated
	 */
	EAttribute getGlobalVariable_Type();

	/**
	 * Returns the meta object for the attribute '{@link eclipse.emf.abmodel.model.abmodel.GlobalVariable#getInitValue <em>Init Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Init Value</em>'.
	 * @see eclipse.emf.abmodel.model.abmodel.GlobalVariable#getInitValue()
	 * @see #getGlobalVariable()
	 * @generated
	 */
	EAttribute getGlobalVariable_InitValue();

	/**
	 * Returns the meta object for class '{@link eclipse.emf.abmodel.model.abmodel.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see eclipse.emf.abmodel.model.abmodel.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute '{@link eclipse.emf.abmodel.model.abmodel.Parameter#getParamName <em>Param Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Param Name</em>'.
	 * @see eclipse.emf.abmodel.model.abmodel.Parameter#getParamName()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_ParamName();

	/**
	 * Returns the meta object for the attribute '{@link eclipse.emf.abmodel.model.abmodel.Parameter#getTargetVariable <em>Target Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Variable</em>'.
	 * @see eclipse.emf.abmodel.model.abmodel.Parameter#getTargetVariable()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_TargetVariable();

	/**
	 * Returns the meta object for class '{@link eclipse.emf.abmodel.model.abmodel.Output <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output</em>'.
	 * @see eclipse.emf.abmodel.model.abmodel.Output
	 * @generated
	 */
	EClass getOutput();

	/**
	 * Returns the meta object for the attribute '{@link eclipse.emf.abmodel.model.abmodel.Output#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see eclipse.emf.abmodel.model.abmodel.Output#getId()
	 * @see #getOutput()
	 * @generated
	 */
	EAttribute getOutput_Id();

	/**
	 * Returns the meta object for the reference list '{@link eclipse.emf.abmodel.model.abmodel.Output#getHasM <em>Has M</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Has M</em>'.
	 * @see eclipse.emf.abmodel.model.abmodel.Output#getHasM()
	 * @see #getOutput()
	 * @generated
	 */
	EReference getOutput_HasM();

	/**
	 * Returns the meta object for the containment reference list '{@link eclipse.emf.abmodel.model.abmodel.Output#getContainsD <em>Contains D</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains D</em>'.
	 * @see eclipse.emf.abmodel.model.abmodel.Output#getContainsD()
	 * @see #getOutput()
	 * @generated
	 */
	EReference getOutput_ContainsD();

	/**
	 * Returns the meta object for the containment reference list '{@link eclipse.emf.abmodel.model.abmodel.Output#getHasEF <em>Has EF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has EF</em>'.
	 * @see eclipse.emf.abmodel.model.abmodel.Output#getHasEF()
	 * @see #getOutput()
	 * @generated
	 */
	EReference getOutput_HasEF();

	/**
	 * Returns the meta object for the containment reference list '{@link eclipse.emf.abmodel.model.abmodel.Output#getHasI <em>Has I</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has I</em>'.
	 * @see eclipse.emf.abmodel.model.abmodel.Output#getHasI()
	 * @see #getOutput()
	 * @generated
	 */
	EReference getOutput_HasI();

	/**
	 * Returns the meta object for class '{@link eclipse.emf.abmodel.model.abmodel.Display <em>Display</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Display</em>'.
	 * @see eclipse.emf.abmodel.model.abmodel.Display
	 * @generated
	 */
	EClass getDisplay();

	/**
	 * Returns the meta object for the attribute '{@link eclipse.emf.abmodel.model.abmodel.Display#getDisplayName <em>Display Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display Name</em>'.
	 * @see eclipse.emf.abmodel.model.abmodel.Display#getDisplayName()
	 * @see #getDisplay()
	 * @generated
	 */
	EAttribute getDisplay_DisplayName();

	/**
	 * Returns the meta object for the attribute '{@link eclipse.emf.abmodel.model.abmodel.Display#getDisplayType <em>Display Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display Type</em>'.
	 * @see eclipse.emf.abmodel.model.abmodel.Display#getDisplayType()
	 * @see #getDisplay()
	 * @generated
	 */
	EAttribute getDisplay_DisplayType();

	/**
	 * Returns the meta object for class '{@link eclipse.emf.abmodel.model.abmodel.Plan <em>Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plan</em>'.
	 * @see eclipse.emf.abmodel.model.abmodel.Plan
	 * @generated
	 */
	EClass getPlan();

	/**
	 * Returns the meta object for the attribute '{@link eclipse.emf.abmodel.model.abmodel.Plan#getPlanName <em>Plan Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Plan Name</em>'.
	 * @see eclipse.emf.abmodel.model.abmodel.Plan#getPlanName()
	 * @see #getPlan()
	 * @generated
	 */
	EAttribute getPlan_PlanName();

	/**
	 * Returns the meta object for the attribute '{@link eclipse.emf.abmodel.model.abmodel.Plan#getIntention <em>Intention</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Intention</em>'.
	 * @see eclipse.emf.abmodel.model.abmodel.Plan#getIntention()
	 * @see #getPlan()
	 * @generated
	 */
	EAttribute getPlan_Intention();

	/**
	 * Returns the meta object for class '{@link eclipse.emf.abmodel.model.abmodel.Monitor <em>Monitor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Monitor</em>'.
	 * @see eclipse.emf.abmodel.model.abmodel.Monitor
	 * @generated
	 */
	EClass getMonitor();

	/**
	 * Returns the meta object for the attribute '{@link eclipse.emf.abmodel.model.abmodel.Monitor#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see eclipse.emf.abmodel.model.abmodel.Monitor#getLabel()
	 * @see #getMonitor()
	 * @generated
	 */
	EAttribute getMonitor_Label();

	/**
	 * Returns the meta object for the attribute '{@link eclipse.emf.abmodel.model.abmodel.Monitor#getTargetVar <em>Target Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Var</em>'.
	 * @see eclipse.emf.abmodel.model.abmodel.Monitor#getTargetVar()
	 * @see #getMonitor()
	 * @generated
	 */
	EAttribute getMonitor_TargetVar();

	/**
	 * Returns the meta object for class '{@link eclipse.emf.abmodel.model.abmodel.ExperimentBlock <em>Experiment Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Experiment Block</em>'.
	 * @see eclipse.emf.abmodel.model.abmodel.ExperimentBlock
	 * @generated
	 */
	EClass getExperimentBlock();

	/**
	 * Returns the meta object for the containment reference list '{@link eclipse.emf.abmodel.model.abmodel.ExperimentBlock#getHasPa <em>Has Pa</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Pa</em>'.
	 * @see eclipse.emf.abmodel.model.abmodel.ExperimentBlock#getHasPa()
	 * @see #getExperimentBlock()
	 * @generated
	 */
	EReference getExperimentBlock_HasPa();

	/**
	 * Returns the meta object for the containment reference list '{@link eclipse.emf.abmodel.model.abmodel.ExperimentBlock#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Output</em>'.
	 * @see eclipse.emf.abmodel.model.abmodel.ExperimentBlock#getOutput()
	 * @see #getExperimentBlock()
	 * @generated
	 */
	EReference getExperimentBlock_Output();

	/**
	 * Returns the meta object for the attribute '{@link eclipse.emf.abmodel.model.abmodel.ExperimentBlock#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see eclipse.emf.abmodel.model.abmodel.ExperimentBlock#getType()
	 * @see #getExperimentBlock()
	 * @generated
	 */
	EAttribute getExperimentBlock_Type();

	/**
	 * Returns the meta object for the attribute '{@link eclipse.emf.abmodel.model.abmodel.ExperimentBlock#getExpName <em>Exp Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exp Name</em>'.
	 * @see eclipse.emf.abmodel.model.abmodel.ExperimentBlock#getExpName()
	 * @see #getExperimentBlock()
	 * @generated
	 */
	EAttribute getExperimentBlock_ExpName();

	/**
	 * Returns the meta object for class '{@link eclipse.emf.abmodel.model.abmodel.Reflex <em>Reflex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reflex</em>'.
	 * @see eclipse.emf.abmodel.model.abmodel.Reflex
	 * @generated
	 */
	EClass getReflex();

	/**
	 * Returns the meta object for the attribute '{@link eclipse.emf.abmodel.model.abmodel.Reflex#isExistReflex <em>Exist Reflex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exist Reflex</em>'.
	 * @see eclipse.emf.abmodel.model.abmodel.Reflex#isExistReflex()
	 * @see #getReflex()
	 * @generated
	 */
	EAttribute getReflex_ExistReflex();

	/**
	 * Returns the meta object for the attribute '{@link eclipse.emf.abmodel.model.abmodel.Reflex#isGoal <em>Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Goal</em>'.
	 * @see eclipse.emf.abmodel.model.abmodel.Reflex#isGoal()
	 * @see #getReflex()
	 * @generated
	 */
	EAttribute getReflex_Goal();

	/**
	 * Returns the meta object for class '{@link eclipse.emf.abmodel.model.abmodel.ComplexePlan <em>Complexe Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Complexe Plan</em>'.
	 * @see eclipse.emf.abmodel.model.abmodel.ComplexePlan
	 * @generated
	 */
	EClass getComplexePlan();

	/**
	 * Returns the meta object for the attribute '{@link eclipse.emf.abmodel.model.abmodel.ComplexePlan#getReturnType <em>Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return Type</em>'.
	 * @see eclipse.emf.abmodel.model.abmodel.ComplexePlan#getReturnType()
	 * @see #getComplexePlan()
	 * @generated
	 */
	EAttribute getComplexePlan_ReturnType();

	/**
	 * Returns the meta object for class '{@link eclipse.emf.abmodel.model.abmodel.ExportFile <em>Export File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Export File</em>'.
	 * @see eclipse.emf.abmodel.model.abmodel.ExportFile
	 * @generated
	 */
	EClass getExportFile();

	/**
	 * Returns the meta object for the attribute '{@link eclipse.emf.abmodel.model.abmodel.ExportFile#getFileName <em>File Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File Name</em>'.
	 * @see eclipse.emf.abmodel.model.abmodel.ExportFile#getFileName()
	 * @see #getExportFile()
	 * @generated
	 */
	EAttribute getExportFile_FileName();

	/**
	 * Returns the meta object for class '{@link eclipse.emf.abmodel.model.abmodel.Inspector <em>Inspector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inspector</em>'.
	 * @see eclipse.emf.abmodel.model.abmodel.Inspector
	 * @generated
	 */
	EClass getInspector();

	/**
	 * Returns the meta object for the attribute '{@link eclipse.emf.abmodel.model.abmodel.Inspector#getInspectorName <em>Inspector Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inspector Name</em>'.
	 * @see eclipse.emf.abmodel.model.abmodel.Inspector#getInspectorName()
	 * @see #getInspector()
	 * @generated
	 */
	EAttribute getInspector_InspectorName();

	/**
	 * Returns the meta object for the attribute '{@link eclipse.emf.abmodel.model.abmodel.Inspector#getAgentValue <em>Agent Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Agent Value</em>'.
	 * @see eclipse.emf.abmodel.model.abmodel.Inspector#getAgentValue()
	 * @see #getInspector()
	 * @generated
	 */
	EAttribute getInspector_AgentValue();

	/**
	 * Returns the meta object for the attribute '{@link eclipse.emf.abmodel.model.abmodel.Inspector#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see eclipse.emf.abmodel.model.abmodel.Inspector#getType()
	 * @see #getInspector()
	 * @generated
	 */
	EAttribute getInspector_Type();

	/**
	 * Returns the meta object for class '{@link eclipse.emf.abmodel.model.abmodel.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see eclipse.emf.abmodel.model.abmodel.Property
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for the attribute '{@link eclipse.emf.abmodel.model.abmodel.Property#getNameofvariable <em>Nameofvariable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nameofvariable</em>'.
	 * @see eclipse.emf.abmodel.model.abmodel.Property#getNameofvariable()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Nameofvariable();

	/**
	 * Returns the meta object for the attribute '{@link eclipse.emf.abmodel.model.abmodel.Property#getAssociateValue <em>Associate Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Associate Value</em>'.
	 * @see eclipse.emf.abmodel.model.abmodel.Property#getAssociateValue()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_AssociateValue();

	/**
	 * Returns the meta object for the attribute '{@link eclipse.emf.abmodel.model.abmodel.Property#getDefaultType <em>Default Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Type</em>'.
	 * @see eclipse.emf.abmodel.model.abmodel.Property#getDefaultType()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_DefaultType();

	/**
	 * Returns the meta object for class '{@link eclipse.emf.abmodel.model.abmodel.SpatialEntity <em>Spatial Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spatial Entity</em>'.
	 * @see eclipse.emf.abmodel.model.abmodel.SpatialEntity
	 * @generated
	 */
	EClass getSpatialEntity();

	/**
	 * Returns the meta object for the attribute '{@link eclipse.emf.abmodel.model.abmodel.SpatialEntity#getShapeName <em>Shape Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shape Name</em>'.
	 * @see eclipse.emf.abmodel.model.abmodel.SpatialEntity#getShapeName()
	 * @see #getSpatialEntity()
	 * @generated
	 */
	EAttribute getSpatialEntity_ShapeName();

	/**
	 * Returns the meta object for the attribute '{@link eclipse.emf.abmodel.model.abmodel.SpatialEntity#getShapePath <em>Shape Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shape Path</em>'.
	 * @see eclipse.emf.abmodel.model.abmodel.SpatialEntity#getShapePath()
	 * @see #getSpatialEntity()
	 * @generated
	 */
	EAttribute getSpatialEntity_ShapePath();

	/**
	 * Returns the meta object for the attribute '{@link eclipse.emf.abmodel.model.abmodel.SpatialEntity#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see eclipse.emf.abmodel.model.abmodel.SpatialEntity#getType()
	 * @see #getSpatialEntity()
	 * @generated
	 */
	EAttribute getSpatialEntity_Type();

	/**
	 * Returns the meta object for class '{@link eclipse.emf.abmodel.model.abmodel.Polygon <em>Polygon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Polygon</em>'.
	 * @see eclipse.emf.abmodel.model.abmodel.Polygon
	 * @generated
	 */
	EClass getPolygon();

	/**
	 * Returns the meta object for class '{@link eclipse.emf.abmodel.model.abmodel.Line <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Line</em>'.
	 * @see eclipse.emf.abmodel.model.abmodel.Line
	 * @generated
	 */
	EClass getLine();

	/**
	 * Returns the meta object for class '{@link eclipse.emf.abmodel.model.abmodel.Point <em>Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Point</em>'.
	 * @see eclipse.emf.abmodel.model.abmodel.Point
	 * @generated
	 */
	EClass getPoint();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AbmodelFactory getAbmodelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link eclipse.emf.abmodel.model.abmodel.impl.ABModelImpl <em>AB Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eclipse.emf.abmodel.model.abmodel.impl.ABModelImpl
		 * @see eclipse.emf.abmodel.model.abmodel.impl.AbmodelPackageImpl#getABModel()
		 * @generated
		 */
		EClass AB_MODEL = eINSTANCE.getABModel();

		/**
		 * The meta object literal for the '<em><b>Contains G</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AB_MODEL__CONTAINS_G = eINSTANCE.getABModel_ContainsG();

		/**
		 * The meta object literal for the '<em><b>Contains S</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AB_MODEL__CONTAINS_S = eINSTANCE.getABModel_ContainsS();

		/**
		 * The meta object literal for the '<em><b>Contains E</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AB_MODEL__CONTAINS_E = eINSTANCE.getABModel_ContainsE();

		/**
		 * The meta object literal for the '<em><b>Model Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AB_MODEL__MODEL_NAME = eINSTANCE.getABModel_ModelName();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AB_MODEL__DESCRIPTION = eINSTANCE.getABModel_Description();

		/**
		 * The meta object literal for the '<em><b>Keywords</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AB_MODEL__KEYWORDS = eINSTANCE.getABModel_Keywords();

		/**
		 * The meta object literal for the '<em><b>Author</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AB_MODEL__AUTHOR = eINSTANCE.getABModel_Author();

		/**
		 * The meta object literal for the '<em><b>Create On</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AB_MODEL__CREATE_ON = eINSTANCE.getABModel_CreateOn();

		/**
		 * The meta object literal for the '{@link eclipse.emf.abmodel.model.abmodel.impl.AgentBlockImpl <em>Agent Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eclipse.emf.abmodel.model.abmodel.impl.AgentBlockImpl
		 * @see eclipse.emf.abmodel.model.abmodel.impl.AbmodelPackageImpl#getAgentBlock()
		 * @generated
		 */
		EClass AGENT_BLOCK = eINSTANCE.getAgentBlock();

		/**
		 * The meta object literal for the '<em><b>Has P</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENT_BLOCK__HAS_P = eINSTANCE.getAgentBlock_HasP();

		/**
		 * The meta object literal for the '<em><b>Has Pr</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENT_BLOCK__HAS_PR = eINSTANCE.getAgentBlock_HasPr();

		/**
		 * The meta object literal for the '<em><b>Name Agent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGENT_BLOCK__NAME_AGENT = eINSTANCE.getAgentBlock_NameAgent();

		/**
		 * The meta object literal for the '<em><b>Aspect Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGENT_BLOCK__ASPECT_NAME = eINSTANCE.getAgentBlock_AspectName();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGENT_BLOCK__COLOR = eINSTANCE.getAgentBlock_Color();

		/**
		 * The meta object literal for the '<em><b>Init</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGENT_BLOCK__INIT = eINSTANCE.getAgentBlock_Init();

		/**
		 * The meta object literal for the '<em><b>Aspect Function</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGENT_BLOCK__ASPECT_FUNCTION = eINSTANCE.getAgentBlock_AspectFunction();

		/**
		 * The meta object literal for the '<em><b>Agent Architecture</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGENT_BLOCK__AGENT_ARCHITECTURE = eINSTANCE.getAgentBlock_AgentArchitecture();

		/**
		 * The meta object literal for the '<em><b>Skillofagent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGENT_BLOCK__SKILLOFAGENT = eINSTANCE.getAgentBlock_Skillofagent();

		/**
		 * The meta object literal for the '{@link eclipse.emf.abmodel.model.abmodel.impl.simplePlanImpl <em>simple Plan</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eclipse.emf.abmodel.model.abmodel.impl.simplePlanImpl
		 * @see eclipse.emf.abmodel.model.abmodel.impl.AbmodelPackageImpl#getsimplePlan()
		 * @generated
		 */
		EClass SIMPLE_PLAN = eINSTANCE.getsimplePlan();

		/**
		 * The meta object literal for the '<em><b>Return Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_PLAN__RETURN_TYPE = eINSTANCE.getsimplePlan_ReturnType();

		/**
		 * The meta object literal for the '{@link eclipse.emf.abmodel.model.abmodel.impl.GlobalBlockImpl <em>Global Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eclipse.emf.abmodel.model.abmodel.impl.GlobalBlockImpl
		 * @see eclipse.emf.abmodel.model.abmodel.impl.AbmodelPackageImpl#getGlobalBlock()
		 * @generated
		 */
		EClass GLOBAL_BLOCK = eINSTANCE.getGlobalBlock();

		/**
		 * The meta object literal for the '<em><b>Contains Gl</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLOBAL_BLOCK__CONTAINS_GL = eINSTANCE.getGlobalBlock_ContainsGl();

		/**
		 * The meta object literal for the '<em><b>Contains SE</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLOBAL_BLOCK__CONTAINS_SE = eINSTANCE.getGlobalBlock_ContainsSE();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GLOBAL_BLOCK__ID = eINSTANCE.getGlobalBlock_Id();

		/**
		 * The meta object literal for the '<em><b>Init</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GLOBAL_BLOCK__INIT = eINSTANCE.getGlobalBlock_Init();

		/**
		 * The meta object literal for the '{@link eclipse.emf.abmodel.model.abmodel.impl.GlobalVariableImpl <em>Global Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eclipse.emf.abmodel.model.abmodel.impl.GlobalVariableImpl
		 * @see eclipse.emf.abmodel.model.abmodel.impl.AbmodelPackageImpl#getGlobalVariable()
		 * @generated
		 */
		EClass GLOBAL_VARIABLE = eINSTANCE.getGlobalVariable();

		/**
		 * The meta object literal for the '<em><b>Init</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GLOBAL_VARIABLE__INIT = eINSTANCE.getGlobalVariable_Init();

		/**
		 * The meta object literal for the '<em><b>Gvar Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GLOBAL_VARIABLE__GVAR_NAME = eINSTANCE.getGlobalVariable_GvarName();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GLOBAL_VARIABLE__TYPE = eINSTANCE.getGlobalVariable_Type();

		/**
		 * The meta object literal for the '<em><b>Init Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GLOBAL_VARIABLE__INIT_VALUE = eINSTANCE.getGlobalVariable_InitValue();

		/**
		 * The meta object literal for the '{@link eclipse.emf.abmodel.model.abmodel.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eclipse.emf.abmodel.model.abmodel.impl.ParameterImpl
		 * @see eclipse.emf.abmodel.model.abmodel.impl.AbmodelPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Param Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__PARAM_NAME = eINSTANCE.getParameter_ParamName();

		/**
		 * The meta object literal for the '<em><b>Target Variable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__TARGET_VARIABLE = eINSTANCE.getParameter_TargetVariable();

		/**
		 * The meta object literal for the '{@link eclipse.emf.abmodel.model.abmodel.impl.OutputImpl <em>Output</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eclipse.emf.abmodel.model.abmodel.impl.OutputImpl
		 * @see eclipse.emf.abmodel.model.abmodel.impl.AbmodelPackageImpl#getOutput()
		 * @generated
		 */
		EClass OUTPUT = eINSTANCE.getOutput();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT__ID = eINSTANCE.getOutput_Id();

		/**
		 * The meta object literal for the '<em><b>Has M</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT__HAS_M = eINSTANCE.getOutput_HasM();

		/**
		 * The meta object literal for the '<em><b>Contains D</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT__CONTAINS_D = eINSTANCE.getOutput_ContainsD();

		/**
		 * The meta object literal for the '<em><b>Has EF</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT__HAS_EF = eINSTANCE.getOutput_HasEF();

		/**
		 * The meta object literal for the '<em><b>Has I</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT__HAS_I = eINSTANCE.getOutput_HasI();

		/**
		 * The meta object literal for the '{@link eclipse.emf.abmodel.model.abmodel.impl.DisplayImpl <em>Display</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eclipse.emf.abmodel.model.abmodel.impl.DisplayImpl
		 * @see eclipse.emf.abmodel.model.abmodel.impl.AbmodelPackageImpl#getDisplay()
		 * @generated
		 */
		EClass DISPLAY = eINSTANCE.getDisplay();

		/**
		 * The meta object literal for the '<em><b>Display Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISPLAY__DISPLAY_NAME = eINSTANCE.getDisplay_DisplayName();

		/**
		 * The meta object literal for the '<em><b>Display Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISPLAY__DISPLAY_TYPE = eINSTANCE.getDisplay_DisplayType();

		/**
		 * The meta object literal for the '{@link eclipse.emf.abmodel.model.abmodel.impl.PlanImpl <em>Plan</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eclipse.emf.abmodel.model.abmodel.impl.PlanImpl
		 * @see eclipse.emf.abmodel.model.abmodel.impl.AbmodelPackageImpl#getPlan()
		 * @generated
		 */
		EClass PLAN = eINSTANCE.getPlan();

		/**
		 * The meta object literal for the '<em><b>Plan Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAN__PLAN_NAME = eINSTANCE.getPlan_PlanName();

		/**
		 * The meta object literal for the '<em><b>Intention</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAN__INTENTION = eINSTANCE.getPlan_Intention();

		/**
		 * The meta object literal for the '{@link eclipse.emf.abmodel.model.abmodel.impl.MonitorImpl <em>Monitor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eclipse.emf.abmodel.model.abmodel.impl.MonitorImpl
		 * @see eclipse.emf.abmodel.model.abmodel.impl.AbmodelPackageImpl#getMonitor()
		 * @generated
		 */
		EClass MONITOR = eINSTANCE.getMonitor();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MONITOR__LABEL = eINSTANCE.getMonitor_Label();

		/**
		 * The meta object literal for the '<em><b>Target Var</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MONITOR__TARGET_VAR = eINSTANCE.getMonitor_TargetVar();

		/**
		 * The meta object literal for the '{@link eclipse.emf.abmodel.model.abmodel.impl.ExperimentBlockImpl <em>Experiment Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eclipse.emf.abmodel.model.abmodel.impl.ExperimentBlockImpl
		 * @see eclipse.emf.abmodel.model.abmodel.impl.AbmodelPackageImpl#getExperimentBlock()
		 * @generated
		 */
		EClass EXPERIMENT_BLOCK = eINSTANCE.getExperimentBlock();

		/**
		 * The meta object literal for the '<em><b>Has Pa</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPERIMENT_BLOCK__HAS_PA = eINSTANCE.getExperimentBlock_HasPa();

		/**
		 * The meta object literal for the '<em><b>Output</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPERIMENT_BLOCK__OUTPUT = eINSTANCE.getExperimentBlock_Output();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPERIMENT_BLOCK__TYPE = eINSTANCE.getExperimentBlock_Type();

		/**
		 * The meta object literal for the '<em><b>Exp Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPERIMENT_BLOCK__EXP_NAME = eINSTANCE.getExperimentBlock_ExpName();

		/**
		 * The meta object literal for the '{@link eclipse.emf.abmodel.model.abmodel.impl.ReflexImpl <em>Reflex</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eclipse.emf.abmodel.model.abmodel.impl.ReflexImpl
		 * @see eclipse.emf.abmodel.model.abmodel.impl.AbmodelPackageImpl#getReflex()
		 * @generated
		 */
		EClass REFLEX = eINSTANCE.getReflex();

		/**
		 * The meta object literal for the '<em><b>Exist Reflex</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFLEX__EXIST_REFLEX = eINSTANCE.getReflex_ExistReflex();

		/**
		 * The meta object literal for the '<em><b>Goal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFLEX__GOAL = eINSTANCE.getReflex_Goal();

		/**
		 * The meta object literal for the '{@link eclipse.emf.abmodel.model.abmodel.impl.ComplexePlanImpl <em>Complexe Plan</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eclipse.emf.abmodel.model.abmodel.impl.ComplexePlanImpl
		 * @see eclipse.emf.abmodel.model.abmodel.impl.AbmodelPackageImpl#getComplexePlan()
		 * @generated
		 */
		EClass COMPLEXE_PLAN = eINSTANCE.getComplexePlan();

		/**
		 * The meta object literal for the '<em><b>Return Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPLEXE_PLAN__RETURN_TYPE = eINSTANCE.getComplexePlan_ReturnType();

		/**
		 * The meta object literal for the '{@link eclipse.emf.abmodel.model.abmodel.impl.ExportFileImpl <em>Export File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eclipse.emf.abmodel.model.abmodel.impl.ExportFileImpl
		 * @see eclipse.emf.abmodel.model.abmodel.impl.AbmodelPackageImpl#getExportFile()
		 * @generated
		 */
		EClass EXPORT_FILE = eINSTANCE.getExportFile();

		/**
		 * The meta object literal for the '<em><b>File Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPORT_FILE__FILE_NAME = eINSTANCE.getExportFile_FileName();

		/**
		 * The meta object literal for the '{@link eclipse.emf.abmodel.model.abmodel.impl.InspectorImpl <em>Inspector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eclipse.emf.abmodel.model.abmodel.impl.InspectorImpl
		 * @see eclipse.emf.abmodel.model.abmodel.impl.AbmodelPackageImpl#getInspector()
		 * @generated
		 */
		EClass INSPECTOR = eINSTANCE.getInspector();

		/**
		 * The meta object literal for the '<em><b>Inspector Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSPECTOR__INSPECTOR_NAME = eINSTANCE.getInspector_InspectorName();

		/**
		 * The meta object literal for the '<em><b>Agent Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSPECTOR__AGENT_VALUE = eINSTANCE.getInspector_AgentValue();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSPECTOR__TYPE = eINSTANCE.getInspector_Type();

		/**
		 * The meta object literal for the '{@link eclipse.emf.abmodel.model.abmodel.impl.PropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eclipse.emf.abmodel.model.abmodel.impl.PropertyImpl
		 * @see eclipse.emf.abmodel.model.abmodel.impl.AbmodelPackageImpl#getProperty()
		 * @generated
		 */
		EClass PROPERTY = eINSTANCE.getProperty();

		/**
		 * The meta object literal for the '<em><b>Nameofvariable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__NAMEOFVARIABLE = eINSTANCE.getProperty_Nameofvariable();

		/**
		 * The meta object literal for the '<em><b>Associate Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__ASSOCIATE_VALUE = eINSTANCE.getProperty_AssociateValue();

		/**
		 * The meta object literal for the '<em><b>Default Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__DEFAULT_TYPE = eINSTANCE.getProperty_DefaultType();

		/**
		 * The meta object literal for the '{@link eclipse.emf.abmodel.model.abmodel.impl.SpatialEntityImpl <em>Spatial Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eclipse.emf.abmodel.model.abmodel.impl.SpatialEntityImpl
		 * @see eclipse.emf.abmodel.model.abmodel.impl.AbmodelPackageImpl#getSpatialEntity()
		 * @generated
		 */
		EClass SPATIAL_ENTITY = eINSTANCE.getSpatialEntity();

		/**
		 * The meta object literal for the '<em><b>Shape Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPATIAL_ENTITY__SHAPE_NAME = eINSTANCE.getSpatialEntity_ShapeName();

		/**
		 * The meta object literal for the '<em><b>Shape Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPATIAL_ENTITY__SHAPE_PATH = eINSTANCE.getSpatialEntity_ShapePath();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPATIAL_ENTITY__TYPE = eINSTANCE.getSpatialEntity_Type();

		/**
		 * The meta object literal for the '{@link eclipse.emf.abmodel.model.abmodel.impl.PolygonImpl <em>Polygon</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eclipse.emf.abmodel.model.abmodel.impl.PolygonImpl
		 * @see eclipse.emf.abmodel.model.abmodel.impl.AbmodelPackageImpl#getPolygon()
		 * @generated
		 */
		EClass POLYGON = eINSTANCE.getPolygon();

		/**
		 * The meta object literal for the '{@link eclipse.emf.abmodel.model.abmodel.impl.LineImpl <em>Line</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eclipse.emf.abmodel.model.abmodel.impl.LineImpl
		 * @see eclipse.emf.abmodel.model.abmodel.impl.AbmodelPackageImpl#getLine()
		 * @generated
		 */
		EClass LINE = eINSTANCE.getLine();

		/**
		 * The meta object literal for the '{@link eclipse.emf.abmodel.model.abmodel.impl.PointImpl <em>Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eclipse.emf.abmodel.model.abmodel.impl.PointImpl
		 * @see eclipse.emf.abmodel.model.abmodel.impl.AbmodelPackageImpl#getPoint()
		 * @generated
		 */
		EClass POINT = eINSTANCE.getPoint();

	}

} //AbmodelPackage
