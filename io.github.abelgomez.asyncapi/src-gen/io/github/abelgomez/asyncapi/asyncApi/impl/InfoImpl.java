/**
 * generated by Xtext 2.17.0
 */
package io.github.abelgomez.asyncapi.asyncApi.impl;

import io.github.abelgomez.asyncapi.asyncApi.AbstractContact;
import io.github.abelgomez.asyncapi.asyncApi.AbstractLicense;
import io.github.abelgomez.asyncapi.asyncApi.AsyncApiPackage;
import io.github.abelgomez.asyncapi.asyncApi.Info;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.github.abelgomez.asyncapi.asyncApi.impl.InfoImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link io.github.abelgomez.asyncapi.asyncApi.impl.InfoImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link io.github.abelgomez.asyncapi.asyncApi.impl.InfoImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link io.github.abelgomez.asyncapi.asyncApi.impl.InfoImpl#getTermsOfService <em>Terms Of Service</em>}</li>
 *   <li>{@link io.github.abelgomez.asyncapi.asyncApi.impl.InfoImpl#getContact <em>Contact</em>}</li>
 *   <li>{@link io.github.abelgomez.asyncapi.asyncApi.impl.InfoImpl#getLicense <em>License</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InfoImpl extends AbstractInfoImpl implements Info
{
  /**
   * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTitle()
   * @generated
   * @ordered
   */
  protected static final String TITLE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTitle()
   * @generated
   * @ordered
   */
  protected String title = TITLE_EDEFAULT;

  /**
   * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVersion()
   * @generated
   * @ordered
   */
  protected static final String VERSION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVersion()
   * @generated
   * @ordered
   */
  protected String version = VERSION_EDEFAULT;

  /**
   * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected static final String DESCRIPTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected String description = DESCRIPTION_EDEFAULT;

  /**
   * The default value of the '{@link #getTermsOfService() <em>Terms Of Service</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTermsOfService()
   * @generated
   * @ordered
   */
  protected static final String TERMS_OF_SERVICE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTermsOfService() <em>Terms Of Service</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTermsOfService()
   * @generated
   * @ordered
   */
  protected String termsOfService = TERMS_OF_SERVICE_EDEFAULT;

  /**
   * The cached value of the '{@link #getContact() <em>Contact</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContact()
   * @generated
   * @ordered
   */
  protected AbstractContact contact;

  /**
   * The cached value of the '{@link #getLicense() <em>License</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLicense()
   * @generated
   * @ordered
   */
  protected AbstractLicense license;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InfoImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return AsyncApiPackage.Literals.INFO;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getTitle()
  {
    return title;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setTitle(String newTitle)
  {
    String oldTitle = title;
    title = newTitle;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AsyncApiPackage.INFO__TITLE, oldTitle, title));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getVersion()
  {
    return version;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setVersion(String newVersion)
  {
    String oldVersion = version;
    version = newVersion;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AsyncApiPackage.INFO__VERSION, oldVersion, version));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getDescription()
  {
    return description;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setDescription(String newDescription)
  {
    String oldDescription = description;
    description = newDescription;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AsyncApiPackage.INFO__DESCRIPTION, oldDescription, description));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getTermsOfService()
  {
    return termsOfService;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setTermsOfService(String newTermsOfService)
  {
    String oldTermsOfService = termsOfService;
    termsOfService = newTermsOfService;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AsyncApiPackage.INFO__TERMS_OF_SERVICE, oldTermsOfService, termsOfService));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AbstractContact getContact()
  {
    return contact;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetContact(AbstractContact newContact, NotificationChain msgs)
  {
    AbstractContact oldContact = contact;
    contact = newContact;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AsyncApiPackage.INFO__CONTACT, oldContact, newContact);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setContact(AbstractContact newContact)
  {
    if (newContact != contact)
    {
      NotificationChain msgs = null;
      if (contact != null)
        msgs = ((InternalEObject)contact).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AsyncApiPackage.INFO__CONTACT, null, msgs);
      if (newContact != null)
        msgs = ((InternalEObject)newContact).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AsyncApiPackage.INFO__CONTACT, null, msgs);
      msgs = basicSetContact(newContact, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AsyncApiPackage.INFO__CONTACT, newContact, newContact));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AbstractLicense getLicense()
  {
    return license;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLicense(AbstractLicense newLicense, NotificationChain msgs)
  {
    AbstractLicense oldLicense = license;
    license = newLicense;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AsyncApiPackage.INFO__LICENSE, oldLicense, newLicense);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setLicense(AbstractLicense newLicense)
  {
    if (newLicense != license)
    {
      NotificationChain msgs = null;
      if (license != null)
        msgs = ((InternalEObject)license).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AsyncApiPackage.INFO__LICENSE, null, msgs);
      if (newLicense != null)
        msgs = ((InternalEObject)newLicense).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AsyncApiPackage.INFO__LICENSE, null, msgs);
      msgs = basicSetLicense(newLicense, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AsyncApiPackage.INFO__LICENSE, newLicense, newLicense));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case AsyncApiPackage.INFO__CONTACT:
        return basicSetContact(null, msgs);
      case AsyncApiPackage.INFO__LICENSE:
        return basicSetLicense(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case AsyncApiPackage.INFO__TITLE:
        return getTitle();
      case AsyncApiPackage.INFO__VERSION:
        return getVersion();
      case AsyncApiPackage.INFO__DESCRIPTION:
        return getDescription();
      case AsyncApiPackage.INFO__TERMS_OF_SERVICE:
        return getTermsOfService();
      case AsyncApiPackage.INFO__CONTACT:
        return getContact();
      case AsyncApiPackage.INFO__LICENSE:
        return getLicense();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case AsyncApiPackage.INFO__TITLE:
        setTitle((String)newValue);
        return;
      case AsyncApiPackage.INFO__VERSION:
        setVersion((String)newValue);
        return;
      case AsyncApiPackage.INFO__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case AsyncApiPackage.INFO__TERMS_OF_SERVICE:
        setTermsOfService((String)newValue);
        return;
      case AsyncApiPackage.INFO__CONTACT:
        setContact((AbstractContact)newValue);
        return;
      case AsyncApiPackage.INFO__LICENSE:
        setLicense((AbstractLicense)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case AsyncApiPackage.INFO__TITLE:
        setTitle(TITLE_EDEFAULT);
        return;
      case AsyncApiPackage.INFO__VERSION:
        setVersion(VERSION_EDEFAULT);
        return;
      case AsyncApiPackage.INFO__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case AsyncApiPackage.INFO__TERMS_OF_SERVICE:
        setTermsOfService(TERMS_OF_SERVICE_EDEFAULT);
        return;
      case AsyncApiPackage.INFO__CONTACT:
        setContact((AbstractContact)null);
        return;
      case AsyncApiPackage.INFO__LICENSE:
        setLicense((AbstractLicense)null);
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case AsyncApiPackage.INFO__TITLE:
        return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
      case AsyncApiPackage.INFO__VERSION:
        return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
      case AsyncApiPackage.INFO__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case AsyncApiPackage.INFO__TERMS_OF_SERVICE:
        return TERMS_OF_SERVICE_EDEFAULT == null ? termsOfService != null : !TERMS_OF_SERVICE_EDEFAULT.equals(termsOfService);
      case AsyncApiPackage.INFO__CONTACT:
        return contact != null;
      case AsyncApiPackage.INFO__LICENSE:
        return license != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (title: ");
    result.append(title);
    result.append(", version: ");
    result.append(version);
    result.append(", description: ");
    result.append(description);
    result.append(", termsOfService: ");
    result.append(termsOfService);
    result.append(')');
    return result.toString();
  }

} //InfoImpl
