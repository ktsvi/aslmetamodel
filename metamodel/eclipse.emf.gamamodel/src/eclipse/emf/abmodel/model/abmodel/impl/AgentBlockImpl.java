/**
 */
package eclipse.emf.abmodel.model.abmodel.impl;

import eclipse.emf.abmodel.model.abmodel.AbmodelPackage;
import eclipse.emf.abmodel.model.abmodel.AgentBlock;
import eclipse.emf.abmodel.model.abmodel.Plan;
import eclipse.emf.abmodel.model.abmodel.Property;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Agent Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eclipse.emf.abmodel.model.abmodel.impl.AgentBlockImpl#getHasP <em>Has P</em>}</li>
 *   <li>{@link eclipse.emf.abmodel.model.abmodel.impl.AgentBlockImpl#getHasPr <em>Has Pr</em>}</li>
 *   <li>{@link eclipse.emf.abmodel.model.abmodel.impl.AgentBlockImpl#getNameAgent <em>Name Agent</em>}</li>
 *   <li>{@link eclipse.emf.abmodel.model.abmodel.impl.AgentBlockImpl#getAspectName <em>Aspect Name</em>}</li>
 *   <li>{@link eclipse.emf.abmodel.model.abmodel.impl.AgentBlockImpl#getColor <em>Color</em>}</li>
 *   <li>{@link eclipse.emf.abmodel.model.abmodel.impl.AgentBlockImpl#isInit <em>Init</em>}</li>
 *   <li>{@link eclipse.emf.abmodel.model.abmodel.impl.AgentBlockImpl#isAspectFunction <em>Aspect Function</em>}</li>
 *   <li>{@link eclipse.emf.abmodel.model.abmodel.impl.AgentBlockImpl#getAgentArchitecture <em>Agent Architecture</em>}</li>
 *   <li>{@link eclipse.emf.abmodel.model.abmodel.impl.AgentBlockImpl#getSkillofagent <em>Skillofagent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AgentBlockImpl extends MinimalEObjectImpl.Container implements AgentBlock {
	/**
	 * The cached value of the '{@link #getHasP() <em>Has P</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasP()
	 * @generated
	 * @ordered
	 */
	protected EList<Plan> hasP;

	/**
	 * The cached value of the '{@link #getHasPr() <em>Has Pr</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasPr()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> hasPr;

	/**
	 * The default value of the '{@link #getNameAgent() <em>Name Agent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameAgent()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_AGENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNameAgent() <em>Name Agent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameAgent()
	 * @generated
	 * @ordered
	 */
	protected String nameAgent = NAME_AGENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getAspectName() <em>Aspect Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAspectName()
	 * @generated
	 * @ordered
	 */
	protected static final String ASPECT_NAME_EDEFAULT = "sphere";

	/**
	 * The cached value of the '{@link #getAspectName() <em>Aspect Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAspectName()
	 * @generated
	 * @ordered
	 */
	protected String aspectName = ASPECT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected static final String COLOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected String color = COLOR_EDEFAULT;

	/**
	 * The default value of the '{@link #isInit() <em>Init</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInit()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INIT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isInit() <em>Init</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInit()
	 * @generated
	 * @ordered
	 */
	protected boolean init = INIT_EDEFAULT;

	/**
	 * The default value of the '{@link #isAspectFunction() <em>Aspect Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAspectFunction()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ASPECT_FUNCTION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAspectFunction() <em>Aspect Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAspectFunction()
	 * @generated
	 * @ordered
	 */
	protected boolean aspectFunction = ASPECT_FUNCTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getAgentArchitecture() <em>Agent Architecture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgentArchitecture()
	 * @generated
	 * @ordered
	 */
	protected static final String AGENT_ARCHITECTURE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAgentArchitecture() <em>Agent Architecture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgentArchitecture()
	 * @generated
	 * @ordered
	 */
	protected String agentArchitecture = AGENT_ARCHITECTURE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSkillofagent() <em>Skillofagent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSkillofagent()
	 * @generated
	 * @ordered
	 */
	protected static final String SKILLOFAGENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSkillofagent() <em>Skillofagent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSkillofagent()
	 * @generated
	 * @ordered
	 */
	protected String skillofagent = SKILLOFAGENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AgentBlockImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AbmodelPackage.Literals.AGENT_BLOCK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Plan> getHasP() {
		if (hasP == null) {
			hasP = new EObjectContainmentEList<Plan>(Plan.class, this, AbmodelPackage.AGENT_BLOCK__HAS_P);
		}
		return hasP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getHasPr() {
		if (hasPr == null) {
			hasPr = new EObjectContainmentEList<Property>(Property.class, this, AbmodelPackage.AGENT_BLOCK__HAS_PR);
		}
		return hasPr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNameAgent() {
		return nameAgent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNameAgent(String newNameAgent) {
		String oldNameAgent = nameAgent;
		nameAgent = newNameAgent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbmodelPackage.AGENT_BLOCK__NAME_AGENT, oldNameAgent, nameAgent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAspectName() {
		return aspectName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAspectName(String newAspectName) {
		String oldAspectName = aspectName;
		aspectName = newAspectName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbmodelPackage.AGENT_BLOCK__ASPECT_NAME, oldAspectName, aspectName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getColor() {
		return color;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColor(String newColor) {
		String oldColor = color;
		color = newColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbmodelPackage.AGENT_BLOCK__COLOR, oldColor, color));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInit() {
		return init;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInit(boolean newInit) {
		boolean oldInit = init;
		init = newInit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbmodelPackage.AGENT_BLOCK__INIT, oldInit, init));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAspectFunction() {
		return aspectFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAspectFunction(boolean newAspectFunction) {
		boolean oldAspectFunction = aspectFunction;
		aspectFunction = newAspectFunction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbmodelPackage.AGENT_BLOCK__ASPECT_FUNCTION, oldAspectFunction, aspectFunction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAgentArchitecture() {
		return agentArchitecture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAgentArchitecture(String newAgentArchitecture) {
		String oldAgentArchitecture = agentArchitecture;
		agentArchitecture = newAgentArchitecture;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbmodelPackage.AGENT_BLOCK__AGENT_ARCHITECTURE, oldAgentArchitecture, agentArchitecture));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSkillofagent() {
		return skillofagent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSkillofagent(String newSkillofagent) {
		String oldSkillofagent = skillofagent;
		skillofagent = newSkillofagent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbmodelPackage.AGENT_BLOCK__SKILLOFAGENT, oldSkillofagent, skillofagent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AbmodelPackage.AGENT_BLOCK__HAS_P:
				return ((InternalEList<?>)getHasP()).basicRemove(otherEnd, msgs);
			case AbmodelPackage.AGENT_BLOCK__HAS_PR:
				return ((InternalEList<?>)getHasPr()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AbmodelPackage.AGENT_BLOCK__HAS_P:
				return getHasP();
			case AbmodelPackage.AGENT_BLOCK__HAS_PR:
				return getHasPr();
			case AbmodelPackage.AGENT_BLOCK__NAME_AGENT:
				return getNameAgent();
			case AbmodelPackage.AGENT_BLOCK__ASPECT_NAME:
				return getAspectName();
			case AbmodelPackage.AGENT_BLOCK__COLOR:
				return getColor();
			case AbmodelPackage.AGENT_BLOCK__INIT:
				return isInit();
			case AbmodelPackage.AGENT_BLOCK__ASPECT_FUNCTION:
				return isAspectFunction();
			case AbmodelPackage.AGENT_BLOCK__AGENT_ARCHITECTURE:
				return getAgentArchitecture();
			case AbmodelPackage.AGENT_BLOCK__SKILLOFAGENT:
				return getSkillofagent();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AbmodelPackage.AGENT_BLOCK__HAS_P:
				getHasP().clear();
				getHasP().addAll((Collection<? extends Plan>)newValue);
				return;
			case AbmodelPackage.AGENT_BLOCK__HAS_PR:
				getHasPr().clear();
				getHasPr().addAll((Collection<? extends Property>)newValue);
				return;
			case AbmodelPackage.AGENT_BLOCK__NAME_AGENT:
				setNameAgent((String)newValue);
				return;
			case AbmodelPackage.AGENT_BLOCK__ASPECT_NAME:
				setAspectName((String)newValue);
				return;
			case AbmodelPackage.AGENT_BLOCK__COLOR:
				setColor((String)newValue);
				return;
			case AbmodelPackage.AGENT_BLOCK__INIT:
				setInit((Boolean)newValue);
				return;
			case AbmodelPackage.AGENT_BLOCK__ASPECT_FUNCTION:
				setAspectFunction((Boolean)newValue);
				return;
			case AbmodelPackage.AGENT_BLOCK__AGENT_ARCHITECTURE:
				setAgentArchitecture((String)newValue);
				return;
			case AbmodelPackage.AGENT_BLOCK__SKILLOFAGENT:
				setSkillofagent((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case AbmodelPackage.AGENT_BLOCK__HAS_P:
				getHasP().clear();
				return;
			case AbmodelPackage.AGENT_BLOCK__HAS_PR:
				getHasPr().clear();
				return;
			case AbmodelPackage.AGENT_BLOCK__NAME_AGENT:
				setNameAgent(NAME_AGENT_EDEFAULT);
				return;
			case AbmodelPackage.AGENT_BLOCK__ASPECT_NAME:
				setAspectName(ASPECT_NAME_EDEFAULT);
				return;
			case AbmodelPackage.AGENT_BLOCK__COLOR:
				setColor(COLOR_EDEFAULT);
				return;
			case AbmodelPackage.AGENT_BLOCK__INIT:
				setInit(INIT_EDEFAULT);
				return;
			case AbmodelPackage.AGENT_BLOCK__ASPECT_FUNCTION:
				setAspectFunction(ASPECT_FUNCTION_EDEFAULT);
				return;
			case AbmodelPackage.AGENT_BLOCK__AGENT_ARCHITECTURE:
				setAgentArchitecture(AGENT_ARCHITECTURE_EDEFAULT);
				return;
			case AbmodelPackage.AGENT_BLOCK__SKILLOFAGENT:
				setSkillofagent(SKILLOFAGENT_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AbmodelPackage.AGENT_BLOCK__HAS_P:
				return hasP != null && !hasP.isEmpty();
			case AbmodelPackage.AGENT_BLOCK__HAS_PR:
				return hasPr != null && !hasPr.isEmpty();
			case AbmodelPackage.AGENT_BLOCK__NAME_AGENT:
				return NAME_AGENT_EDEFAULT == null ? nameAgent != null : !NAME_AGENT_EDEFAULT.equals(nameAgent);
			case AbmodelPackage.AGENT_BLOCK__ASPECT_NAME:
				return ASPECT_NAME_EDEFAULT == null ? aspectName != null : !ASPECT_NAME_EDEFAULT.equals(aspectName);
			case AbmodelPackage.AGENT_BLOCK__COLOR:
				return COLOR_EDEFAULT == null ? color != null : !COLOR_EDEFAULT.equals(color);
			case AbmodelPackage.AGENT_BLOCK__INIT:
				return init != INIT_EDEFAULT;
			case AbmodelPackage.AGENT_BLOCK__ASPECT_FUNCTION:
				return aspectFunction != ASPECT_FUNCTION_EDEFAULT;
			case AbmodelPackage.AGENT_BLOCK__AGENT_ARCHITECTURE:
				return AGENT_ARCHITECTURE_EDEFAULT == null ? agentArchitecture != null : !AGENT_ARCHITECTURE_EDEFAULT.equals(agentArchitecture);
			case AbmodelPackage.AGENT_BLOCK__SKILLOFAGENT:
				return SKILLOFAGENT_EDEFAULT == null ? skillofagent != null : !SKILLOFAGENT_EDEFAULT.equals(skillofagent);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (nameAgent: ");
		result.append(nameAgent);
		result.append(", aspectName: ");
		result.append(aspectName);
		result.append(", color: ");
		result.append(color);
		result.append(", init: ");
		result.append(init);
		result.append(", aspectFunction: ");
		result.append(aspectFunction);
		result.append(", agentArchitecture: ");
		result.append(agentArchitecture);
		result.append(", skillofagent: ");
		result.append(skillofagent);
		result.append(')');
		return result.toString();
	}

} //AgentBlockImpl
