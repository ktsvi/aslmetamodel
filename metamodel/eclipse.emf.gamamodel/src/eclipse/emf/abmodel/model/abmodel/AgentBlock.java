/**
 */
package eclipse.emf.abmodel.model.abmodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Agent Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eclipse.emf.abmodel.model.abmodel.AgentBlock#getHasP <em>Has P</em>}</li>
 *   <li>{@link eclipse.emf.abmodel.model.abmodel.AgentBlock#getHasPr <em>Has Pr</em>}</li>
 *   <li>{@link eclipse.emf.abmodel.model.abmodel.AgentBlock#getNameAgent <em>Name Agent</em>}</li>
 *   <li>{@link eclipse.emf.abmodel.model.abmodel.AgentBlock#getAspectName <em>Aspect Name</em>}</li>
 *   <li>{@link eclipse.emf.abmodel.model.abmodel.AgentBlock#getColor <em>Color</em>}</li>
 *   <li>{@link eclipse.emf.abmodel.model.abmodel.AgentBlock#isInit <em>Init</em>}</li>
 *   <li>{@link eclipse.emf.abmodel.model.abmodel.AgentBlock#isAspectFunction <em>Aspect Function</em>}</li>
 *   <li>{@link eclipse.emf.abmodel.model.abmodel.AgentBlock#getAgentArchitecture <em>Agent Architecture</em>}</li>
 *   <li>{@link eclipse.emf.abmodel.model.abmodel.AgentBlock#getSkillofagent <em>Skillofagent</em>}</li>
 * </ul>
 *
 * @see eclipse.emf.abmodel.model.abmodel.AbmodelPackage#getAgentBlock()
 * @model annotation="http://www.obeo.fr/dsl/dnc/archetype archetype='Description'"
 * @generated
 */
public interface AgentBlock extends EObject {
	/**
	 * Returns the value of the '<em><b>Has P</b></em>' containment reference list.
	 * The list contents are of type {@link eclipse.emf.abmodel.model.abmodel.Plan}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has P</em>' containment reference list.
	 * @see eclipse.emf.abmodel.model.abmodel.AbmodelPackage#getAgentBlock_HasP()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Plan> getHasP();

	/**
	 * Returns the value of the '<em><b>Has Pr</b></em>' containment reference list.
	 * The list contents are of type {@link eclipse.emf.abmodel.model.abmodel.Property}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Pr</em>' containment reference list.
	 * @see eclipse.emf.abmodel.model.abmodel.AbmodelPackage#getAgentBlock_HasPr()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Property> getHasPr();

	/**
	 * Returns the value of the '<em><b>Name Agent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Agent</em>' attribute.
	 * @see #setNameAgent(String)
	 * @see eclipse.emf.abmodel.model.abmodel.AbmodelPackage#getAgentBlock_NameAgent()
	 * @model
	 * @generated
	 */
	String getNameAgent();

	/**
	 * Sets the value of the '{@link eclipse.emf.abmodel.model.abmodel.AgentBlock#getNameAgent <em>Name Agent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Agent</em>' attribute.
	 * @see #getNameAgent()
	 * @generated
	 */
	void setNameAgent(String value);

	/**
	 * Returns the value of the '<em><b>Aspect Name</b></em>' attribute.
	 * The default value is <code>"sphere"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aspect Name</em>' attribute.
	 * @see #setAspectName(String)
	 * @see eclipse.emf.abmodel.model.abmodel.AbmodelPackage#getAgentBlock_AspectName()
	 * @model default="sphere"
	 * @generated
	 */
	String getAspectName();

	/**
	 * Sets the value of the '{@link eclipse.emf.abmodel.model.abmodel.AgentBlock#getAspectName <em>Aspect Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aspect Name</em>' attribute.
	 * @see #getAspectName()
	 * @generated
	 */
	void setAspectName(String value);

	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color</em>' attribute.
	 * @see #setColor(String)
	 * @see eclipse.emf.abmodel.model.abmodel.AbmodelPackage#getAgentBlock_Color()
	 * @model
	 * @generated
	 */
	String getColor();

	/**
	 * Sets the value of the '{@link eclipse.emf.abmodel.model.abmodel.AgentBlock#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see #getColor()
	 * @generated
	 */
	void setColor(String value);

	/**
	 * Returns the value of the '<em><b>Init</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Init</em>' attribute.
	 * @see #setInit(boolean)
	 * @see eclipse.emf.abmodel.model.abmodel.AbmodelPackage#getAgentBlock_Init()
	 * @model default="false"
	 * @generated
	 */
	boolean isInit();

	/**
	 * Sets the value of the '{@link eclipse.emf.abmodel.model.abmodel.AgentBlock#isInit <em>Init</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Init</em>' attribute.
	 * @see #isInit()
	 * @generated
	 */
	void setInit(boolean value);

	/**
	 * Returns the value of the '<em><b>Aspect Function</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aspect Function</em>' attribute.
	 * @see #setAspectFunction(boolean)
	 * @see eclipse.emf.abmodel.model.abmodel.AbmodelPackage#getAgentBlock_AspectFunction()
	 * @model default="false"
	 * @generated
	 */
	boolean isAspectFunction();

	/**
	 * Sets the value of the '{@link eclipse.emf.abmodel.model.abmodel.AgentBlock#isAspectFunction <em>Aspect Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aspect Function</em>' attribute.
	 * @see #isAspectFunction()
	 * @generated
	 */
	void setAspectFunction(boolean value);

	/**
	 * Returns the value of the '<em><b>Agent Architecture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Agent Architecture</em>' attribute.
	 * @see #setAgentArchitecture(String)
	 * @see eclipse.emf.abmodel.model.abmodel.AbmodelPackage#getAgentBlock_AgentArchitecture()
	 * @model
	 * @generated
	 */
	String getAgentArchitecture();

	/**
	 * Sets the value of the '{@link eclipse.emf.abmodel.model.abmodel.AgentBlock#getAgentArchitecture <em>Agent Architecture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Agent Architecture</em>' attribute.
	 * @see #getAgentArchitecture()
	 * @generated
	 */
	void setAgentArchitecture(String value);

	/**
	 * Returns the value of the '<em><b>Skillofagent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Skillofagent</em>' attribute.
	 * @see #setSkillofagent(String)
	 * @see eclipse.emf.abmodel.model.abmodel.AbmodelPackage#getAgentBlock_Skillofagent()
	 * @model
	 * @generated
	 */
	String getSkillofagent();

	/**
	 * Sets the value of the '{@link eclipse.emf.abmodel.model.abmodel.AgentBlock#getSkillofagent <em>Skillofagent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Skillofagent</em>' attribute.
	 * @see #getSkillofagent()
	 * @generated
	 */
	void setSkillofagent(String value);

} // AgentBlock
