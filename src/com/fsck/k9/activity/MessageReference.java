package com.fsck.k9.activity;

import java.io.Serializable;

import com.fsck.k9.K9;

import android.util.Log;

public class MessageReference implements Serializable
{
    public String accountUuid;
    public String folderName;
    public String uid;

    public boolean equals(Object o)
    {
        if (o instanceof MessageReference == false)
        {
            return false;
        }
        MessageReference other = (MessageReference)o;
        if ((accountUuid == other.accountUuid || (accountUuid != null && accountUuid.equals(other.accountUuid)))
                && (folderName == other.folderName || (folderName != null && folderName.equals(other.folderName)))
                && (uid == other.uid || (uid != null && uid.equals(other.uid))))
        {
            return true;
        }
        return false;
    }
    public String toString()
    {
        return "MessageReference{accountUuid = '" +
               accountUuid
               + "', folderName = '" + folderName
               + "', uid = '" + uid
               + "'}";
    }
}
