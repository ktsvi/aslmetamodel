/**
 */
package eclipse.emf.abmodel.model.abmodel.provider;


import eclipse.emf.abmodel.model.abmodel.AbmodelFactory;
import eclipse.emf.abmodel.model.abmodel.AbmodelPackage;
import eclipse.emf.abmodel.model.abmodel.AgentBlock;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link eclipse.emf.abmodel.model.abmodel.AgentBlock} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AgentBlockItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AgentBlockItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addNameAgentPropertyDescriptor(object);
			addAspectNamePropertyDescriptor(object);
			addColorPropertyDescriptor(object);
			addInitPropertyDescriptor(object);
			addAspectFunctionPropertyDescriptor(object);
			addAgentArchitecturePropertyDescriptor(object);
			addSkillofagentPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name Agent feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNameAgentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AgentBlock_nameAgent_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AgentBlock_nameAgent_feature", "_UI_AgentBlock_type"),
				 AbmodelPackage.Literals.AGENT_BLOCK__NAME_AGENT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Aspect Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAspectNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AgentBlock_aspectName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AgentBlock_aspectName_feature", "_UI_AgentBlock_type"),
				 AbmodelPackage.Literals.AGENT_BLOCK__ASPECT_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Color feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addColorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AgentBlock_color_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AgentBlock_color_feature", "_UI_AgentBlock_type"),
				 AbmodelPackage.Literals.AGENT_BLOCK__COLOR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Init feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInitPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AgentBlock_init_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AgentBlock_init_feature", "_UI_AgentBlock_type"),
				 AbmodelPackage.Literals.AGENT_BLOCK__INIT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Aspect Function feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAspectFunctionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AgentBlock_aspectFunction_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AgentBlock_aspectFunction_feature", "_UI_AgentBlock_type"),
				 AbmodelPackage.Literals.AGENT_BLOCK__ASPECT_FUNCTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Agent Architecture feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAgentArchitecturePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AgentBlock_agentArchitecture_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AgentBlock_agentArchitecture_feature", "_UI_AgentBlock_type"),
				 AbmodelPackage.Literals.AGENT_BLOCK__AGENT_ARCHITECTURE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Skillofagent feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSkillofagentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AgentBlock_skillofagent_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AgentBlock_skillofagent_feature", "_UI_AgentBlock_type"),
				 AbmodelPackage.Literals.AGENT_BLOCK__SKILLOFAGENT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(AbmodelPackage.Literals.AGENT_BLOCK__HAS_P);
			childrenFeatures.add(AbmodelPackage.Literals.AGENT_BLOCK__HAS_PR);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns AgentBlock.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/AgentBlock"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((AgentBlock)object).getAspectName();
		return label == null || label.length() == 0 ?
			getString("_UI_AgentBlock_type") :
			getString("_UI_AgentBlock_type") + " " + label;
	}


	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(AgentBlock.class)) {
			case AbmodelPackage.AGENT_BLOCK__NAME_AGENT:
			case AbmodelPackage.AGENT_BLOCK__ASPECT_NAME:
			case AbmodelPackage.AGENT_BLOCK__COLOR:
			case AbmodelPackage.AGENT_BLOCK__INIT:
			case AbmodelPackage.AGENT_BLOCK__ASPECT_FUNCTION:
			case AbmodelPackage.AGENT_BLOCK__AGENT_ARCHITECTURE:
			case AbmodelPackage.AGENT_BLOCK__SKILLOFAGENT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case AbmodelPackage.AGENT_BLOCK__HAS_P:
			case AbmodelPackage.AGENT_BLOCK__HAS_PR:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(AbmodelPackage.Literals.AGENT_BLOCK__HAS_P,
				 AbmodelFactory.eINSTANCE.createPlan()));

		newChildDescriptors.add
			(createChildParameter
				(AbmodelPackage.Literals.AGENT_BLOCK__HAS_P,
				 AbmodelFactory.eINSTANCE.createsimplePlan()));

		newChildDescriptors.add
			(createChildParameter
				(AbmodelPackage.Literals.AGENT_BLOCK__HAS_P,
				 AbmodelFactory.eINSTANCE.createReflex()));

		newChildDescriptors.add
			(createChildParameter
				(AbmodelPackage.Literals.AGENT_BLOCK__HAS_P,
				 AbmodelFactory.eINSTANCE.createComplexePlan()));

		newChildDescriptors.add
			(createChildParameter
				(AbmodelPackage.Literals.AGENT_BLOCK__HAS_PR,
				 AbmodelFactory.eINSTANCE.createProperty()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return AslEditPlugin.INSTANCE;
	}

}
