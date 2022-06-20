/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package com.samsung.android.iap;
public interface IAPServiceCallback extends android.os.IInterface
{
  /** Default implementation for IAPServiceCallback. */
  public static class Default implements com.samsung.android.iap.IAPServiceCallback
  {
    @Override public void responseCallback(android.os.Bundle bundle) throws android.os.RemoteException
    {
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements com.samsung.android.iap.IAPServiceCallback
  {
    private static final java.lang.String DESCRIPTOR = "com.samsung.android.iap.IAPServiceCallback";
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an com.samsung.android.iap.IAPServiceCallback interface,
     * generating a proxy if needed.
     */
    public static com.samsung.android.iap.IAPServiceCallback asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof com.samsung.android.iap.IAPServiceCallback))) {
        return ((com.samsung.android.iap.IAPServiceCallback)iin);
      }
      return new com.samsung.android.iap.IAPServiceCallback.Stub.Proxy(obj);
    }
    @Override public android.os.IBinder asBinder()
    {
      return this;
    }
    @Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
    {
      java.lang.String descriptor = DESCRIPTOR;
      switch (code)
      {
        case INTERFACE_TRANSACTION:
        {
          reply.writeString(descriptor);
          return true;
        }
        case TRANSACTION_responseCallback:
        {
          data.enforceInterface(descriptor);
          android.os.Bundle _arg0;
          if ((0!=data.readInt())) {
            _arg0 = android.os.Bundle.CREATOR.createFromParcel(data);
          }
          else {
            _arg0 = null;
          }
          this.responseCallback(_arg0);
          return true;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
    }
    private static class Proxy implements com.samsung.android.iap.IAPServiceCallback
    {
      private android.os.IBinder mRemote;
      Proxy(android.os.IBinder remote)
      {
        mRemote = remote;
      }
      @Override public android.os.IBinder asBinder()
      {
        return mRemote;
      }
      public java.lang.String getInterfaceDescriptor()
      {
        return DESCRIPTOR;
      }
      @Override public void responseCallback(android.os.Bundle bundle) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          if ((bundle!=null)) {
            _data.writeInt(1);
            bundle.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_responseCallback, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().responseCallback(bundle);
            return;
          }
        }
        finally {
          _data.recycle();
        }
      }
      public static com.samsung.android.iap.IAPServiceCallback sDefaultImpl;
    }
    static final int TRANSACTION_responseCallback = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    public static boolean setDefaultImpl(com.samsung.android.iap.IAPServiceCallback impl) {
      // Only one user of this interface can use this function
      // at a time. This is a heuristic to detect if two different
      // users in the same process use this function.
      if (Stub.Proxy.sDefaultImpl != null) {
        throw new IllegalStateException("setDefaultImpl() called twice");
      }
      if (impl != null) {
        Stub.Proxy.sDefaultImpl = impl;
        return true;
      }
      return false;
    }
    public static com.samsung.android.iap.IAPServiceCallback getDefaultImpl() {
      return Stub.Proxy.sDefaultImpl;
    }
  }
  public void responseCallback(android.os.Bundle bundle) throws android.os.RemoteException;
}
