/**
 */
package eclipse.emf.abmodel.model.abmodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Export File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eclipse.emf.abmodel.model.abmodel.ExportFile#getFileName <em>File Name</em>}</li>
 * </ul>
 *
 * @see eclipse.emf.abmodel.model.abmodel.AbmodelPackage#getExportFile()
 * @model
 * @generated
 */
public interface ExportFile extends EObject {
	/**
	 * Returns the value of the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File Name</em>' attribute.
	 * @see #setFileName(String)
	 * @see eclipse.emf.abmodel.model.abmodel.AbmodelPackage#getExportFile_FileName()
	 * @model
	 * @generated
	 */
	String getFileName();

	/**
	 * Sets the value of the '{@link eclipse.emf.abmodel.model.abmodel.ExportFile#getFileName <em>File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Name</em>' attribute.
	 * @see #getFileName()
	 * @generated
	 */
	void setFileName(String value);

} // ExportFile
