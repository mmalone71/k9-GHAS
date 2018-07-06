package com.fsck.k9

import android.content.Context

class K9CoreResourceProvider(private val context: Context) : CoreResourceProvider {
    override fun defaultSignature(): String = context.getString(R.string.default_signature)
    override fun defaultIdentityDescription(): String = context.getString(R.string.default_identity_description)
}
