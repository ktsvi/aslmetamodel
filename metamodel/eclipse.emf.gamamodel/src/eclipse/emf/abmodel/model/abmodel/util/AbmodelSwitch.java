/**
 */
package eclipse.emf.abmodel.model.abmodel.util;

import eclipse.emf.abmodel.model.abmodel.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see eclipse.emf.abmodel.model.abmodel.AbmodelPackage
 * @generated
 */
public class AbmodelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AbmodelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbmodelSwitch() {
		if (modelPackage == null) {
			modelPackage = AbmodelPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case AbmodelPackage.AB_MODEL: {
				ABModel abModel = (ABModel)theEObject;
				T result = caseABModel(abModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AbmodelPackage.AGENT_BLOCK: {
				AgentBlock agentBlock = (AgentBlock)theEObject;
				T result = caseAgentBlock(agentBlock);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AbmodelPackage.SIMPLE_PLAN: {
				simplePlan simplePlan = (simplePlan)theEObject;
				T result = casesimplePlan(simplePlan);
				if (result == null) result = casePlan(simplePlan);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AbmodelPackage.GLOBAL_BLOCK: {
				GlobalBlock globalBlock = (GlobalBlock)theEObject;
				T result = caseGlobalBlock(globalBlock);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AbmodelPackage.GLOBAL_VARIABLE: {
				GlobalVariable globalVariable = (GlobalVariable)theEObject;
				T result = caseGlobalVariable(globalVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AbmodelPackage.PARAMETER: {
				Parameter parameter = (Parameter)theEObject;
				T result = caseParameter(parameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AbmodelPackage.OUTPUT: {
				Output output = (Output)theEObject;
				T result = caseOutput(output);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AbmodelPackage.DISPLAY: {
				Display display = (Display)theEObject;
				T result = caseDisplay(display);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AbmodelPackage.PLAN: {
				Plan plan = (Plan)theEObject;
				T result = casePlan(plan);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AbmodelPackage.MONITOR: {
				Monitor monitor = (Monitor)theEObject;
				T result = caseMonitor(monitor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AbmodelPackage.EXPERIMENT_BLOCK: {
				ExperimentBlock experimentBlock = (ExperimentBlock)theEObject;
				T result = caseExperimentBlock(experimentBlock);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AbmodelPackage.REFLEX: {
				Reflex reflex = (Reflex)theEObject;
				T result = caseReflex(reflex);
				if (result == null) result = casePlan(reflex);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AbmodelPackage.COMPLEXE_PLAN: {
				ComplexePlan complexePlan = (ComplexePlan)theEObject;
				T result = caseComplexePlan(complexePlan);
				if (result == null) result = casePlan(complexePlan);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AbmodelPackage.EXPORT_FILE: {
				ExportFile exportFile = (ExportFile)theEObject;
				T result = caseExportFile(exportFile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AbmodelPackage.INSPECTOR: {
				Inspector inspector = (Inspector)theEObject;
				T result = caseInspector(inspector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AbmodelPackage.PROPERTY: {
				Property property = (Property)theEObject;
				T result = caseProperty(property);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AbmodelPackage.SPATIAL_ENTITY: {
				SpatialEntity spatialEntity = (SpatialEntity)theEObject;
				T result = caseSpatialEntity(spatialEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AbmodelPackage.POLYGON: {
				Polygon polygon = (Polygon)theEObject;
				T result = casePolygon(polygon);
				if (result == null) result = caseSpatialEntity(polygon);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AbmodelPackage.LINE: {
				Line line = (Line)theEObject;
				T result = caseLine(line);
				if (result == null) result = caseSpatialEntity(line);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AbmodelPackage.POINT: {
				Point point = (Point)theEObject;
				T result = casePoint(point);
				if (result == null) result = caseSpatialEntity(point);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AB Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AB Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseABModel(ABModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Agent Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Agent Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAgentBlock(AgentBlock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>simple Plan</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>simple Plan</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casesimplePlan(simplePlan object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Global Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Global Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGlobalBlock(GlobalBlock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Global Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Global Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGlobalVariable(GlobalVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameter(Parameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Output</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Output</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutput(Output object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Display</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Display</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDisplay(Display object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plan</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plan</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlan(Plan object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Monitor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Monitor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMonitor(Monitor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Experiment Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Experiment Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExperimentBlock(ExperimentBlock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reflex</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reflex</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReflex(Reflex object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Complexe Plan</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Complexe Plan</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComplexePlan(ComplexePlan object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Export File</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Export File</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExportFile(ExportFile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inspector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inspector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInspector(Inspector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProperty(Property object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Spatial Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Spatial Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpatialEntity(SpatialEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Polygon</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Polygon</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePolygon(Polygon object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Line</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Line</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLine(Line object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePoint(Point object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //AbmodelSwitch
