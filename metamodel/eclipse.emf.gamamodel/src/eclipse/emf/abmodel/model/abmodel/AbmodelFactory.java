/**
 */
package eclipse.emf.abmodel.model.abmodel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see eclipse.emf.abmodel.model.abmodel.AbmodelPackage
 * @generated
 */
public interface AbmodelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AbmodelFactory eINSTANCE = eclipse.emf.abmodel.model.abmodel.impl.AbmodelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>AB Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>AB Model</em>'.
	 * @generated
	 */
	ABModel createABModel();

	/**
	 * Returns a new object of class '<em>Agent Block</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Agent Block</em>'.
	 * @generated
	 */
	AgentBlock createAgentBlock();

	/**
	 * Returns a new object of class '<em>simple Plan</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>simple Plan</em>'.
	 * @generated
	 */
	simplePlan createsimplePlan();

	/**
	 * Returns a new object of class '<em>Global Block</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Global Block</em>'.
	 * @generated
	 */
	GlobalBlock createGlobalBlock();

	/**
	 * Returns a new object of class '<em>Global Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Global Variable</em>'.
	 * @generated
	 */
	GlobalVariable createGlobalVariable();

	/**
	 * Returns a new object of class '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter</em>'.
	 * @generated
	 */
	Parameter createParameter();

	/**
	 * Returns a new object of class '<em>Output</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Output</em>'.
	 * @generated
	 */
	Output createOutput();

	/**
	 * Returns a new object of class '<em>Display</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Display</em>'.
	 * @generated
	 */
	Display createDisplay();

	/**
	 * Returns a new object of class '<em>Plan</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Plan</em>'.
	 * @generated
	 */
	Plan createPlan();

	/**
	 * Returns a new object of class '<em>Monitor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Monitor</em>'.
	 * @generated
	 */
	Monitor createMonitor();

	/**
	 * Returns a new object of class '<em>Experiment Block</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Experiment Block</em>'.
	 * @generated
	 */
	ExperimentBlock createExperimentBlock();

	/**
	 * Returns a new object of class '<em>Reflex</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reflex</em>'.
	 * @generated
	 */
	Reflex createReflex();

	/**
	 * Returns a new object of class '<em>Complexe Plan</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Complexe Plan</em>'.
	 * @generated
	 */
	ComplexePlan createComplexePlan();

	/**
	 * Returns a new object of class '<em>Export File</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Export File</em>'.
	 * @generated
	 */
	ExportFile createExportFile();

	/**
	 * Returns a new object of class '<em>Inspector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Inspector</em>'.
	 * @generated
	 */
	Inspector createInspector();

	/**
	 * Returns a new object of class '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property</em>'.
	 * @generated
	 */
	Property createProperty();

	/**
	 * Returns a new object of class '<em>Spatial Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Spatial Entity</em>'.
	 * @generated
	 */
	SpatialEntity createSpatialEntity();

	/**
	 * Returns a new object of class '<em>Polygon</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Polygon</em>'.
	 * @generated
	 */
	Polygon createPolygon();

	/**
	 * Returns a new object of class '<em>Line</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Line</em>'.
	 * @generated
	 */
	Line createLine();

	/**
	 * Returns a new object of class '<em>Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Point</em>'.
	 * @generated
	 */
	Point createPoint();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AbmodelPackage getAbmodelPackage();

} //AbmodelFactory
