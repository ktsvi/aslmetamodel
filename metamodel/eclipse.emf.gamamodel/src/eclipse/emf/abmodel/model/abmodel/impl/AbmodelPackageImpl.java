/**
 */
package eclipse.emf.abmodel.model.abmodel.impl;

import eclipse.emf.abmodel.model.abmodel.ABModel;
import eclipse.emf.abmodel.model.abmodel.AbmodelFactory;
import eclipse.emf.abmodel.model.abmodel.AbmodelPackage;
import eclipse.emf.abmodel.model.abmodel.AgentBlock;
import eclipse.emf.abmodel.model.abmodel.ComplexePlan;
import eclipse.emf.abmodel.model.abmodel.Display;
import eclipse.emf.abmodel.model.abmodel.ExperimentBlock;
import eclipse.emf.abmodel.model.abmodel.ExportFile;
import eclipse.emf.abmodel.model.abmodel.GlobalBlock;
import eclipse.emf.abmodel.model.abmodel.GlobalVariable;
import eclipse.emf.abmodel.model.abmodel.Inspector;
import eclipse.emf.abmodel.model.abmodel.Line;
import eclipse.emf.abmodel.model.abmodel.Monitor;
import eclipse.emf.abmodel.model.abmodel.Output;
import eclipse.emf.abmodel.model.abmodel.Parameter;
import eclipse.emf.abmodel.model.abmodel.Plan;
import eclipse.emf.abmodel.model.abmodel.Point;
import eclipse.emf.abmodel.model.abmodel.Polygon;
import eclipse.emf.abmodel.model.abmodel.Property;
import eclipse.emf.abmodel.model.abmodel.Reflex;
import eclipse.emf.abmodel.model.abmodel.SpatialEntity;
import eclipse.emf.abmodel.model.abmodel.simplePlan;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AbmodelPackageImpl extends EPackageImpl implements AbmodelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass agentBlockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simplePlanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass globalBlockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass globalVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass displayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass planEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass monitorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass experimentBlockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reflexEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass complexePlanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exportFileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inspectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spatialEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass polygonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pointEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see eclipse.emf.abmodel.model.abmodel.AbmodelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AbmodelPackageImpl() {
		super(eNS_URI, AbmodelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link AbmodelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AbmodelPackage init() {
		if (isInited) return (AbmodelPackage)EPackage.Registry.INSTANCE.getEPackage(AbmodelPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredAbmodelPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		AbmodelPackageImpl theAbmodelPackage = registeredAbmodelPackage instanceof AbmodelPackageImpl ? (AbmodelPackageImpl)registeredAbmodelPackage : new AbmodelPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theAbmodelPackage.createPackageContents();

		// Initialize created meta-data
		theAbmodelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAbmodelPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AbmodelPackage.eNS_URI, theAbmodelPackage);
		return theAbmodelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getABModel() {
		return abModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getABModel_ContainsG() {
		return (EReference)abModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getABModel_ContainsS() {
		return (EReference)abModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getABModel_ContainsE() {
		return (EReference)abModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getABModel_ModelName() {
		return (EAttribute)abModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getABModel_Description() {
		return (EAttribute)abModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getABModel_Keywords() {
		return (EAttribute)abModelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getABModel_Author() {
		return (EAttribute)abModelEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getABModel_CreateOn() {
		return (EAttribute)abModelEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAgentBlock() {
		return agentBlockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAgentBlock_HasP() {
		return (EReference)agentBlockEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAgentBlock_HasPr() {
		return (EReference)agentBlockEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAgentBlock_NameAgent() {
		return (EAttribute)agentBlockEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAgentBlock_AspectName() {
		return (EAttribute)agentBlockEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAgentBlock_Color() {
		return (EAttribute)agentBlockEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAgentBlock_Init() {
		return (EAttribute)agentBlockEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAgentBlock_AspectFunction() {
		return (EAttribute)agentBlockEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAgentBlock_AgentArchitecture() {
		return (EAttribute)agentBlockEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAgentBlock_Skillofagent() {
		return (EAttribute)agentBlockEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getsimplePlan() {
		return simplePlanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getsimplePlan_ReturnType() {
		return (EAttribute)simplePlanEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGlobalBlock() {
		return globalBlockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlobalBlock_ContainsGl() {
		return (EReference)globalBlockEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlobalBlock_ContainsSE() {
		return (EReference)globalBlockEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlobalBlock_Id() {
		return (EAttribute)globalBlockEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlobalBlock_Init() {
		return (EAttribute)globalBlockEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGlobalVariable() {
		return globalVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlobalVariable_Init() {
		return (EAttribute)globalVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlobalVariable_GvarName() {
		return (EAttribute)globalVariableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlobalVariable_Type() {
		return (EAttribute)globalVariableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlobalVariable_InitValue() {
		return (EAttribute)globalVariableEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameter() {
		return parameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_ParamName() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_TargetVariable() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutput() {
		return outputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutput_Id() {
		return (EAttribute)outputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutput_HasM() {
		return (EReference)outputEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutput_ContainsD() {
		return (EReference)outputEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutput_HasEF() {
		return (EReference)outputEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutput_HasI() {
		return (EReference)outputEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDisplay() {
		return displayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDisplay_DisplayName() {
		return (EAttribute)displayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDisplay_DisplayType() {
		return (EAttribute)displayEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlan() {
		return planEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlan_PlanName() {
		return (EAttribute)planEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlan_Intention() {
		return (EAttribute)planEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMonitor() {
		return monitorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMonitor_Label() {
		return (EAttribute)monitorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMonitor_TargetVar() {
		return (EAttribute)monitorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExperimentBlock() {
		return experimentBlockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExperimentBlock_HasPa() {
		return (EReference)experimentBlockEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExperimentBlock_Output() {
		return (EReference)experimentBlockEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExperimentBlock_Type() {
		return (EAttribute)experimentBlockEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExperimentBlock_ExpName() {
		return (EAttribute)experimentBlockEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReflex() {
		return reflexEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReflex_ExistReflex() {
		return (EAttribute)reflexEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReflex_Goal() {
		return (EAttribute)reflexEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComplexePlan() {
		return complexePlanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComplexePlan_ReturnType() {
		return (EAttribute)complexePlanEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExportFile() {
		return exportFileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExportFile_FileName() {
		return (EAttribute)exportFileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInspector() {
		return inspectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInspector_InspectorName() {
		return (EAttribute)inspectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInspector_AgentValue() {
		return (EAttribute)inspectorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInspector_Type() {
		return (EAttribute)inspectorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProperty() {
		return propertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_Nameofvariable() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_AssociateValue() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_DefaultType() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpatialEntity() {
		return spatialEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpatialEntity_ShapeName() {
		return (EAttribute)spatialEntityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpatialEntity_ShapePath() {
		return (EAttribute)spatialEntityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpatialEntity_Type() {
		return (EAttribute)spatialEntityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPolygon() {
		return polygonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLine() {
		return lineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPoint() {
		return pointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbmodelFactory getAbmodelFactory() {
		return (AbmodelFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		abModelEClass = createEClass(AB_MODEL);
		createEReference(abModelEClass, AB_MODEL__CONTAINS_G);
		createEReference(abModelEClass, AB_MODEL__CONTAINS_S);
		createEReference(abModelEClass, AB_MODEL__CONTAINS_E);
		createEAttribute(abModelEClass, AB_MODEL__MODEL_NAME);
		createEAttribute(abModelEClass, AB_MODEL__DESCRIPTION);
		createEAttribute(abModelEClass, AB_MODEL__KEYWORDS);
		createEAttribute(abModelEClass, AB_MODEL__AUTHOR);
		createEAttribute(abModelEClass, AB_MODEL__CREATE_ON);

		agentBlockEClass = createEClass(AGENT_BLOCK);
		createEReference(agentBlockEClass, AGENT_BLOCK__HAS_P);
		createEReference(agentBlockEClass, AGENT_BLOCK__HAS_PR);
		createEAttribute(agentBlockEClass, AGENT_BLOCK__NAME_AGENT);
		createEAttribute(agentBlockEClass, AGENT_BLOCK__ASPECT_NAME);
		createEAttribute(agentBlockEClass, AGENT_BLOCK__COLOR);
		createEAttribute(agentBlockEClass, AGENT_BLOCK__INIT);
		createEAttribute(agentBlockEClass, AGENT_BLOCK__ASPECT_FUNCTION);
		createEAttribute(agentBlockEClass, AGENT_BLOCK__AGENT_ARCHITECTURE);
		createEAttribute(agentBlockEClass, AGENT_BLOCK__SKILLOFAGENT);

		simplePlanEClass = createEClass(SIMPLE_PLAN);
		createEAttribute(simplePlanEClass, SIMPLE_PLAN__RETURN_TYPE);

		globalBlockEClass = createEClass(GLOBAL_BLOCK);
		createEReference(globalBlockEClass, GLOBAL_BLOCK__CONTAINS_GL);
		createEReference(globalBlockEClass, GLOBAL_BLOCK__CONTAINS_SE);
		createEAttribute(globalBlockEClass, GLOBAL_BLOCK__ID);
		createEAttribute(globalBlockEClass, GLOBAL_BLOCK__INIT);

		globalVariableEClass = createEClass(GLOBAL_VARIABLE);
		createEAttribute(globalVariableEClass, GLOBAL_VARIABLE__INIT);
		createEAttribute(globalVariableEClass, GLOBAL_VARIABLE__GVAR_NAME);
		createEAttribute(globalVariableEClass, GLOBAL_VARIABLE__TYPE);
		createEAttribute(globalVariableEClass, GLOBAL_VARIABLE__INIT_VALUE);

		parameterEClass = createEClass(PARAMETER);
		createEAttribute(parameterEClass, PARAMETER__PARAM_NAME);
		createEAttribute(parameterEClass, PARAMETER__TARGET_VARIABLE);

		outputEClass = createEClass(OUTPUT);
		createEAttribute(outputEClass, OUTPUT__ID);
		createEReference(outputEClass, OUTPUT__HAS_M);
		createEReference(outputEClass, OUTPUT__CONTAINS_D);
		createEReference(outputEClass, OUTPUT__HAS_EF);
		createEReference(outputEClass, OUTPUT__HAS_I);

		displayEClass = createEClass(DISPLAY);
		createEAttribute(displayEClass, DISPLAY__DISPLAY_NAME);
		createEAttribute(displayEClass, DISPLAY__DISPLAY_TYPE);

		planEClass = createEClass(PLAN);
		createEAttribute(planEClass, PLAN__PLAN_NAME);
		createEAttribute(planEClass, PLAN__INTENTION);

		monitorEClass = createEClass(MONITOR);
		createEAttribute(monitorEClass, MONITOR__LABEL);
		createEAttribute(monitorEClass, MONITOR__TARGET_VAR);

		experimentBlockEClass = createEClass(EXPERIMENT_BLOCK);
		createEReference(experimentBlockEClass, EXPERIMENT_BLOCK__HAS_PA);
		createEReference(experimentBlockEClass, EXPERIMENT_BLOCK__OUTPUT);
		createEAttribute(experimentBlockEClass, EXPERIMENT_BLOCK__TYPE);
		createEAttribute(experimentBlockEClass, EXPERIMENT_BLOCK__EXP_NAME);

		reflexEClass = createEClass(REFLEX);
		createEAttribute(reflexEClass, REFLEX__EXIST_REFLEX);
		createEAttribute(reflexEClass, REFLEX__GOAL);

		complexePlanEClass = createEClass(COMPLEXE_PLAN);
		createEAttribute(complexePlanEClass, COMPLEXE_PLAN__RETURN_TYPE);

		exportFileEClass = createEClass(EXPORT_FILE);
		createEAttribute(exportFileEClass, EXPORT_FILE__FILE_NAME);

		inspectorEClass = createEClass(INSPECTOR);
		createEAttribute(inspectorEClass, INSPECTOR__INSPECTOR_NAME);
		createEAttribute(inspectorEClass, INSPECTOR__AGENT_VALUE);
		createEAttribute(inspectorEClass, INSPECTOR__TYPE);

		propertyEClass = createEClass(PROPERTY);
		createEAttribute(propertyEClass, PROPERTY__NAMEOFVARIABLE);
		createEAttribute(propertyEClass, PROPERTY__ASSOCIATE_VALUE);
		createEAttribute(propertyEClass, PROPERTY__DEFAULT_TYPE);

		spatialEntityEClass = createEClass(SPATIAL_ENTITY);
		createEAttribute(spatialEntityEClass, SPATIAL_ENTITY__SHAPE_NAME);
		createEAttribute(spatialEntityEClass, SPATIAL_ENTITY__SHAPE_PATH);
		createEAttribute(spatialEntityEClass, SPATIAL_ENTITY__TYPE);

		polygonEClass = createEClass(POLYGON);

		lineEClass = createEClass(LINE);

		pointEClass = createEClass(POINT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		simplePlanEClass.getESuperTypes().add(this.getPlan());
		reflexEClass.getESuperTypes().add(this.getPlan());
		complexePlanEClass.getESuperTypes().add(this.getPlan());
		polygonEClass.getESuperTypes().add(this.getSpatialEntity());
		lineEClass.getESuperTypes().add(this.getSpatialEntity());
		pointEClass.getESuperTypes().add(this.getSpatialEntity());

		// Initialize classes, features, and operations; add parameters
		initEClass(abModelEClass, ABModel.class, "ABModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getABModel_ContainsG(), this.getGlobalBlock(), null, "containsG", null, 1, 1, ABModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getABModel_ContainsS(), this.getAgentBlock(), null, "containsS", null, 1, -1, ABModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getABModel_ContainsE(), this.getExperimentBlock(), null, "containsE", null, 1, -1, ABModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getABModel_ModelName(), ecorePackage.getEString(), "modelName", null, 0, 1, ABModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getABModel_Description(), ecorePackage.getEString(), "description", null, 0, 1, ABModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getABModel_Keywords(), ecorePackage.getEString(), "keywords", null, 0, 1, ABModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getABModel_Author(), ecorePackage.getEString(), "author", null, 0, 1, ABModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getABModel_CreateOn(), ecorePackage.getEDate(), "createOn", null, 0, 1, ABModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(agentBlockEClass, AgentBlock.class, "AgentBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAgentBlock_HasP(), this.getPlan(), null, "hasP", null, 1, -1, AgentBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAgentBlock_HasPr(), this.getProperty(), null, "hasPr", null, 1, -1, AgentBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAgentBlock_NameAgent(), ecorePackage.getEString(), "nameAgent", null, 0, 1, AgentBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAgentBlock_AspectName(), ecorePackage.getEString(), "aspectName", "sphere", 0, 1, AgentBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAgentBlock_Color(), ecorePackage.getEString(), "color", null, 0, 1, AgentBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAgentBlock_Init(), ecorePackage.getEBoolean(), "init", "false", 0, 1, AgentBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAgentBlock_AspectFunction(), ecorePackage.getEBoolean(), "aspectFunction", "false", 0, 1, AgentBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAgentBlock_AgentArchitecture(), ecorePackage.getEString(), "agentArchitecture", null, 0, 1, AgentBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAgentBlock_Skillofagent(), ecorePackage.getEString(), "skillofagent", null, 0, 1, AgentBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(simplePlanEClass, simplePlan.class, "simplePlan", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getsimplePlan_ReturnType(), ecorePackage.getEString(), "returnType", null, 0, 1, simplePlan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(globalBlockEClass, GlobalBlock.class, "GlobalBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGlobalBlock_ContainsGl(), this.getGlobalVariable(), null, "containsGl", null, 1, -1, GlobalBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGlobalBlock_ContainsSE(), this.getSpatialEntity(), null, "containsSE", null, 1, -1, GlobalBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlobalBlock_Id(), ecorePackage.getEInt(), "id", null, 0, 1, GlobalBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlobalBlock_Init(), ecorePackage.getEBoolean(), "init", "false", 0, 1, GlobalBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(globalVariableEClass, GlobalVariable.class, "GlobalVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGlobalVariable_Init(), ecorePackage.getEBoolean(), "init", "false", 0, 1, GlobalVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlobalVariable_GvarName(), ecorePackage.getEString(), "gvarName", null, 0, 1, GlobalVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlobalVariable_Type(), ecorePackage.getEString(), "type", null, 0, 1, GlobalVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlobalVariable_InitValue(), ecorePackage.getEString(), "initValue", null, 0, 1, GlobalVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameter_ParamName(), ecorePackage.getEString(), "paramName", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_TargetVariable(), ecorePackage.getEString(), "targetVariable", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(outputEClass, Output.class, "Output", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOutput_Id(), ecorePackage.getEInt(), "id", null, 0, 1, Output.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOutput_HasM(), this.getMonitor(), null, "hasM", null, 1, -1, Output.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOutput_ContainsD(), this.getDisplay(), null, "containsD", null, 1, -1, Output.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOutput_HasEF(), this.getExportFile(), null, "hasEF", null, 1, -1, Output.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOutput_HasI(), this.getInspector(), null, "hasI", null, 1, -1, Output.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(displayEClass, Display.class, "Display", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDisplay_DisplayName(), ecorePackage.getEString(), "displayName", null, 0, 1, Display.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDisplay_DisplayType(), ecorePackage.getEString(), "displayType", null, 0, 1, Display.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(planEClass, Plan.class, "Plan", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPlan_PlanName(), ecorePackage.getEString(), "planName", null, 0, 1, Plan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlan_Intention(), ecorePackage.getEString(), "intention", null, 0, 1, Plan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(monitorEClass, Monitor.class, "Monitor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMonitor_Label(), ecorePackage.getEString(), "label", null, 0, 1, Monitor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMonitor_TargetVar(), ecorePackage.getEString(), "targetVar", null, 0, 1, Monitor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(experimentBlockEClass, ExperimentBlock.class, "ExperimentBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExperimentBlock_HasPa(), this.getParameter(), null, "hasPa", null, 1, -1, ExperimentBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExperimentBlock_Output(), this.getOutput(), null, "output", null, 1, -1, ExperimentBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExperimentBlock_Type(), ecorePackage.getEString(), "type", "gui", 0, 1, ExperimentBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExperimentBlock_ExpName(), ecorePackage.getEString(), "expName", null, 0, 1, ExperimentBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(reflexEClass, Reflex.class, "Reflex", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReflex_ExistReflex(), ecorePackage.getEBoolean(), "existReflex", null, 0, 1, Reflex.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReflex_Goal(), ecorePackage.getEBoolean(), "goal", null, 0, 1, Reflex.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(complexePlanEClass, ComplexePlan.class, "ComplexePlan", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComplexePlan_ReturnType(), ecorePackage.getEString(), "returnType", null, 0, 1, ComplexePlan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(exportFileEClass, ExportFile.class, "ExportFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExportFile_FileName(), ecorePackage.getEString(), "fileName", null, 0, 1, ExportFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inspectorEClass, Inspector.class, "Inspector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInspector_InspectorName(), ecorePackage.getEString(), "inspectorName", null, 0, 1, Inspector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInspector_AgentValue(), ecorePackage.getEString(), "AgentValue", null, 0, 1, Inspector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInspector_Type(), ecorePackage.getEString(), "type", null, 0, 1, Inspector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyEClass, Property.class, "Property", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProperty_Nameofvariable(), ecorePackage.getEString(), "nameofvariable", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_AssociateValue(), ecorePackage.getEString(), "associateValue", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_DefaultType(), ecorePackage.getEString(), "defaultType", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(spatialEntityEClass, SpatialEntity.class, "SpatialEntity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSpatialEntity_ShapeName(), ecorePackage.getEString(), "shapeName", null, 0, 1, SpatialEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpatialEntity_ShapePath(), ecorePackage.getEString(), "shapePath", null, 0, 1, SpatialEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpatialEntity_Type(), ecorePackage.getEString(), "type", "file", 0, 1, SpatialEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(polygonEClass, Polygon.class, "Polygon", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(lineEClass, Line.class, "Line", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pointEClass, Point.class, "Point", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.obeo.fr/dsl/dnc/archetype
		createArchetypeAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.obeo.fr/dsl/dnc/archetype</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createArchetypeAnnotations() {
		String source = "http://www.obeo.fr/dsl/dnc/archetype";
		addAnnotation
		  (abModelEClass,
		   source,
		   new String[] {
			   "archetype", "Description"
		   });
		addAnnotation
		  (agentBlockEClass,
		   source,
		   new String[] {
			   "archetype", "Description"
		   });
		addAnnotation
		  (simplePlanEClass,
		   source,
		   new String[] {
			   "archetype", "Description"
		   });
		addAnnotation
		  (globalBlockEClass,
		   source,
		   new String[] {
			   "archetype", "Role"
		   });
		addAnnotation
		  (globalVariableEClass,
		   source,
		   new String[] {
			   "archetype", "Description"
		   });
		addAnnotation
		  (parameterEClass,
		   source,
		   new String[] {
			   "archetype", "Description"
		   });
		addAnnotation
		  (outputEClass,
		   source,
		   new String[] {
			   "archetype", "Description"
		   });
		addAnnotation
		  (displayEClass,
		   source,
		   new String[] {
			   "archetype", "Role"
		   });
		addAnnotation
		  (planEClass,
		   source,
		   new String[] {
			   "archetype", "Description"
		   });
		addAnnotation
		  (monitorEClass,
		   source,
		   new String[] {
			   "archetype", "Description"
		   });
		addAnnotation
		  (experimentBlockEClass,
		   source,
		   new String[] {
			   "archetype", "Description"
		   });
		addAnnotation
		  (reflexEClass,
		   source,
		   new String[] {
			   "archetype", "Description"
		   });
		addAnnotation
		  (complexePlanEClass,
		   source,
		   new String[] {
			   "archetype", "Description"
		   });
		addAnnotation
		  (polygonEClass,
		   source,
		   new String[] {
			   "archetype", "Thing"
		   });
	}

} //AbmodelPackageImpl
