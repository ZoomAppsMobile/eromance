package com.zoomapps.eromance.Activities;

import java.lang.System;

@permissions.dispatcher.RuntimePermissions()
@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u00f8\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b4\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 \u0098\u00032\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b:\u0004\u0098\u0003\u0099\u0003B\u0005\u00a2\u0006\u0002\u0010\tJ\b\u0010\u00ae\u0002\u001a\u00030\u00af\u0002J\u0012\u0010\u00b0\u0002\u001a\u00020-2\u0007\u0010\u00b1\u0002\u001a\u00020\u000bH\u0016J\b\u0010\u00b2\u0002\u001a\u00030\u00af\u0002J\b\u0010\u00b3\u0002\u001a\u00030\u00af\u0002JR\u0010\u00b4\u0002\u001a\u0005\u0018\u00010\u00c6\u00012\b\u0010\u00b5\u0002\u001a\u00030\u00b6\u00022\b\u0010\u00b7\u0002\u001a\u00030\u00b6\u00022\u0007\u0010\u00b8\u0002\u001a\u00020k2\u000b\b\u0002\u0010\u00b9\u0002\u001a\u0004\u0018\u00010k2\u000b\b\u0002\u0010\u00ba\u0002\u001a\u0004\u0018\u00010\u000b2\t\u0010\u00bb\u0002\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0003\u0010\u00bc\u0002J\r\u0010\u00bd\u0002\u001a\b\u0012\u0004\u0012\u00020z0yJ\u001d\u0010\u00be\u0002\u001a\u00030\u00bf\u00022\b\u0010\u00c0\u0002\u001a\u00030\u00c1\u00022\u0007\u0010\u00c2\u0002\u001a\u00020\u000bH\u0002J\u0014\u0010\u00be\u0002\u001a\u00030\u00bf\u00022\b\u0010\u00c3\u0002\u001a\u00030\u00c4\u0002H\u0003J\u0010\u0010\u00c5\u0002\u001a\u00020\u000b2\u0007\u0010\u00c6\u0002\u001a\u00020\u000bJ\u0011\u0010\u00c7\u0002\u001a\u00030\u00c8\u00022\u0007\u0010\u00b1\u0002\u001a\u00020\u000bJ;\u0010\u00c9\u0002\u001a\u00030\u00af\u00022\u000b\b\u0002\u0010\u00ca\u0002\u001a\u0004\u0018\u00010-2\u0011\b\u0002\u0010\u00cb\u0002\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010%2\u000b\b\u0002\u0010\u00cc\u0002\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0003\u0010\u00cd\u0002J\u0010\u0010\u00ce\u0002\u001a\u00020\u000b2\u0007\u0010\u00cf\u0002\u001a\u00020\u000bJ#\u0010\u00d0\u0002\u001a\u0004\u0018\u00010\u000b2\t\u0010\u00ba\u0002\u001a\u0004\u0018\u00010\u000b2\u0007\u0010\u00d1\u0002\u001a\u00020-\u00a2\u0006\u0003\u0010\u00d2\u0002J\b\u0010\u00d3\u0002\u001a\u00030\u00af\u0002J\n\u0010\u00d4\u0002\u001a\u00030\u00af\u0002H\u0002J\b\u0010\u00d5\u0002\u001a\u00030\u00af\u0002J\b\u0010\u00d6\u0002\u001a\u00030\u00af\u0002J\b\u0010\u00d7\u0002\u001a\u00030\u00af\u0002J\b\u0010\u00d8\u0002\u001a\u00030\u00af\u0002J\n\u0010\u00d9\u0002\u001a\u00030\u00af\u0002H\u0002J\n\u0010\u00da\u0002\u001a\u00030\u00af\u0002H\u0002J\b\u0010\u00db\u0002\u001a\u00030\u00af\u0002J\n\u0010\u00dc\u0002\u001a\u00030\u00af\u0002H\u0007J\n\u0010\u00dd\u0002\u001a\u00030\u00af\u0002H\u0007J\u0016\u0010\u00de\u0002\u001a\u00030\u00af\u00022\n\u0010\u00df\u0002\u001a\u0005\u0018\u00010\u00e0\u0002H\u0017J\u0014\u0010\u00e1\u0002\u001a\u00030\u00af\u00022\b\u0010\u00df\u0002\u001a\u00030\u00e2\u0002H\u0016J\u0013\u0010\u00e3\u0002\u001a\u00030\u00af\u00022\u0007\u0010\u00df\u0002\u001a\u00020\u000bH\u0016J\u0016\u0010\u00e4\u0002\u001a\u00030\u00af\u00022\n\u0010\u00e5\u0002\u001a\u0005\u0018\u00010\u00e0\u0002H\u0014J\n\u0010\u00e6\u0002\u001a\u00030\u00af\u0002H\u0014J\u0016\u0010\u00e7\u0002\u001a\u00030\u00af\u00022\n\u0010\u00df\u0002\u001a\u0005\u0018\u00010\u00e8\u0002H\u0016J\u0014\u0010\u00e9\u0002\u001a\u00030\u00af\u00022\b\u0010\u00ea\u0002\u001a\u00030\u00de\u0001H\u0016J\u0014\u0010\u00eb\u0002\u001a\u00030\u00af\u00022\b\u0010\u00ec\u0002\u001a\u00030\u00e2\u0001H\u0016J\u0015\u0010\u00ed\u0002\u001a\u00020-2\n\u0010\u00df\u0002\u001a\u0005\u0018\u00010\u00c6\u0001H\u0016J\n\u0010\u00ee\u0002\u001a\u00030\u00af\u0002H\u0014J\n\u0010\u00ef\u0002\u001a\u00030\u00af\u0002H\u0014J\n\u0010\u00f0\u0002\u001a\u00030\u00af\u0002H\u0014J\b\u0010\u00f1\u0002\u001a\u00030\u00af\u0002J%\u0010\u00f2\u0002\u001a\u00030\u00af\u00022\u0007\u0010\u00f3\u0002\u001a\u00020k2\u0007\u0010\u00f4\u0002\u001a\u00020k2\t\b\u0002\u0010\u00f5\u0002\u001a\u00020-J\b\u0010\u00f6\u0002\u001a\u00030\u00af\u0002J\n\u0010\u00f7\u0002\u001a\u00030\u00af\u0002H\u0002J\b\u0010\u00f8\u0002\u001a\u00030\u00af\u0002J\u0013\u0010\u00f9\u0002\u001a\u00030\u00af\u00022\u0007\u0010\u00b1\u0002\u001a\u00020\u000bH\u0016J\u0013\u0010\u00fa\u0002\u001a\u00030\u00af\u00022\u0007\u0010\u00b1\u0002\u001a\u00020\u000bH\u0016J\u0010\u0010\u00fb\u0002\u001a\u00020-2\u0007\u0010\u00fc\u0002\u001a\u00020kJ\u0011\u0010\u00fd\u0002\u001a\u00030\u00af\u00022\u0007\u0010\u00fe\u0002\u001a\u00020\u000bJ\n\u0010\u00ff\u0002\u001a\u00030\u00af\u0002H\u0016J\u001b\u0010\u0080\u0003\u001a\u00030\u00af\u00022\u0007\u0010\u00b1\u0002\u001a\u00020\u000b2\b\u0010\u0081\u0003\u001a\u00030\u00c6\u0001J\b\u0010\u0082\u0003\u001a\u00030\u00af\u0002J\u0012\u0010\u0083\u0003\u001a\u00030\u00af\u00022\b\u0010\u0084\u0003\u001a\u00030\u00de\u0001J\u0013\u0010\u0085\u0003\u001a\u00030\u00af\u00022\u0007\u0010\u00b1\u0002\u001a\u00020\u000bH\u0016J\u0013\u0010\u0086\u0003\u001a\u00030\u00af\u00022\u0007\u0010\u00b1\u0002\u001a\u00020\u000bH\u0016J\u001c\u0010\u0087\u0003\u001a\u00030\u00af\u00022\u0007\u0010\u0088\u0003\u001a\u00020-2\t\b\u0002\u0010\u00b1\u0002\u001a\u00020\u000bJ\n\u0010\u0089\u0003\u001a\u00030\u00af\u0002H\u0007J\b\u0010\u008a\u0003\u001a\u00030\u00af\u0002J\u001d\u0010\u008b\u0003\u001a\u00030\u00af\u00022\u0007\u0010\u008c\u0003\u001a\u00020k2\b\u0010\u008d\u0003\u001a\u00030\u008e\u0003H\u0002J\u0014\u0010\u008f\u0003\u001a\u00030\u00af\u00022\b\u0010\u008d\u0003\u001a\u00030\u008e\u0003H\u0007J\b\u0010\u0090\u0003\u001a\u00030\u00af\u0002J\b\u0010\u0091\u0003\u001a\u00030\u00af\u0002J\n\u0010\u0092\u0003\u001a\u00030\u00af\u0002H\u0002J\n\u0010\u0093\u0003\u001a\u00030\u00af\u0002H\u0002J\b\u0010\u0094\u0003\u001a\u00030\u00af\u0002J\u0011\u0010\u0095\u0003\u001a\u00030\u00af\u00022\u0007\u0010\u0096\u0003\u001a\u00020\u000bJ\u0012\u0010\u0097\u0003\u001a\u00030\u00af\u00022\b\u0010\u00df\u0002\u001a\u00030\u00de\u0001R\u0014\u0010\n\u001a\u00020\u000bX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000bX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000bX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000bX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR\u0014\u0010\u0014\u001a\u00020\u000bX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\rR\u0014\u0010\u0016\u001a\u00020\u000bX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\rR\u0014\u0010\u0018\u001a\u00020\u000bX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\rR\u0014\u0010\u001a\u001a\u00020\u000bX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\rR\u0014\u0010\u001c\u001a\u00020\u000bX\u0080D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\rR\u001b\u0010\u001e\u001a\u00020\u001f8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b \u0010!R&\u0010$\u001a\u000e\u0012\b\u0012\u00060&R\u00020\'\u0018\u00010%X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001a\u0010,\u001a\u00020-X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u001b\u00102\u001a\u0002038FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b6\u0010#\u001a\u0004\b4\u00105R\u001a\u00107\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b8\u0010\r\"\u0004\b9\u0010:R$\u0010;\u001a\f\u0012\b\u0012\u00060&R\u00020\'0<X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\u001b\u0010A\u001a\u00020B8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\bE\u0010#\u001a\u0004\bC\u0010DR\u001b\u0010F\u001a\u00020B8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\bH\u0010#\u001a\u0004\bG\u0010DR\u001b\u0010I\u001a\u00020J8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\bM\u0010#\u001a\u0004\bK\u0010LR\u001e\u0010N\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010S\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR \u0010T\u001a\b\u0012\u0004\u0012\u00020\u000b0<X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bU\u0010>\"\u0004\bV\u0010@R\u001b\u0010W\u001a\u00020X8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b[\u0010#\u001a\u0004\bY\u0010ZR\u001b\u0010\\\u001a\u00020]8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b`\u0010#\u001a\u0004\b^\u0010_R\u001b\u0010a\u001a\u00020]8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\bc\u0010#\u001a\u0004\bb\u0010_R\u001b\u0010d\u001a\u00020]8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\bf\u0010#\u001a\u0004\be\u0010_R\u001b\u0010g\u001a\u00020]8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\bi\u0010#\u001a\u0004\bh\u0010_R\"\u0010j\u001a\n\u0012\u0004\u0012\u00020k\u0018\u00010<X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bl\u0010>\"\u0004\bm\u0010@R\u001b\u0010n\u001a\u00020o8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\br\u0010#\u001a\u0004\bp\u0010qR\u001b\u0010s\u001a\u00020t8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\bw\u0010#\u001a\u0004\bu\u0010vR \u0010x\u001a\b\u0012\u0004\u0012\u00020z0yX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b{\u0010)\"\u0004\b|\u0010+R\u001d\u0010}\u001a\u00020~8FX\u0086\u0084\u0002\u00a2\u0006\u000e\n\u0005\b\u0081\u0001\u0010#\u001a\u0005\b\u007f\u0010\u0080\u0001R\u001e\u0010\u0082\u0001\u001a\u00020t8FX\u0086\u0084\u0002\u00a2\u0006\u000e\n\u0005\b\u0084\u0001\u0010#\u001a\u0005\b\u0083\u0001\u0010vR\u001d\u0010\u0085\u0001\u001a\u00020-X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0086\u0001\u0010/\"\u0005\b\u0087\u0001\u00101R\u001e\u0010\u0088\u0001\u001a\u00020t8FX\u0086\u0084\u0002\u00a2\u0006\u000e\n\u0005\b\u008a\u0001\u0010#\u001a\u0005\b\u0089\u0001\u0010vR\u001d\u0010\u008b\u0001\u001a\u00020-X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u008c\u0001\u0010/\"\u0005\b\u008d\u0001\u00101R\u001d\u0010\u008e\u0001\u001a\u00020-X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u008e\u0001\u0010/\"\u0005\b\u008f\u0001\u00101R\u001d\u0010\u0090\u0001\u001a\u00020-X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0090\u0001\u0010/\"\u0005\b\u0091\u0001\u00101R\u001d\u0010\u0092\u0001\u001a\u00020-X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0092\u0001\u0010/\"\u0005\b\u0093\u0001\u00101R\u001d\u0010\u0094\u0001\u001a\u00020-X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0094\u0001\u0010/\"\u0005\b\u0095\u0001\u00101R\u001d\u0010\u0096\u0001\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0097\u0001\u0010\r\"\u0005\b\u0098\u0001\u0010:R\u001d\u0010\u0099\u0001\u001a\u00020-X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u009a\u0001\u0010/\"\u0005\b\u009b\u0001\u00101R\u0019\u0010\u009c\u0001\u001a\u00070\u009d\u0001R\u00020\u0000\u00a2\u0006\n\n\u0000\u001a\u0006\b\u009e\u0001\u0010\u009f\u0001R\u0015\u0010\u00a0\u0001\u001a\u00030\u00a1\u0001\u00a2\u0006\n\n\u0000\u001a\u0006\b\u00a2\u0001\u0010\u00a3\u0001R(\u0010\u00a4\u0001\u001a\u000b\u0012\u0004\u0012\u000203\u0018\u00010\u00a5\u0001X\u0086\u000e\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u00a6\u0001\u0010\u00a7\u0001\"\u0006\b\u00a8\u0001\u0010\u00a9\u0001R&\u0010\u00aa\u0001\u001a\t\u0012\u0002\b\u0003\u0018\u00010\u00ab\u0001X\u0086\u000e\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u00ac\u0001\u0010\u00ad\u0001\"\u0006\b\u00ae\u0001\u0010\u00af\u0001R\"\u0010\u00b0\u0001\u001a\u0005\u0018\u00010\u00b1\u0001X\u0086\u000e\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u00b2\u0001\u0010\u00b3\u0001\"\u0006\b\u00b4\u0001\u0010\u00b5\u0001R\u0012\u0010\u00b6\u0001\u001a\u0005\u0018\u00010\u00b7\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u00b8\u0001\u001a\u00020\u000bX\u0082D\u00a2\u0006\u0002\n\u0000R\"\u0010\u00b9\u0001\u001a\u0005\u0018\u00010\u00ba\u0001X\u0086\u000e\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u00bb\u0001\u0010\u00bc\u0001\"\u0006\b\u00bd\u0001\u0010\u00be\u0001R\"\u0010\u00bf\u0001\u001a\u0005\u0018\u00010\u00c0\u0001X\u0086\u000e\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u00c1\u0001\u0010\u00c2\u0001\"\u0006\b\u00c3\u0001\u0010\u00c4\u0001R\u0012\u0010\u00c5\u0001\u001a\u0005\u0018\u00010\u00c6\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000R&\u0010\u00c7\u0001\u001a\t\u0012\u0002\b\u0003\u0018\u00010\u00ab\u0001X\u0086\u000e\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u00c8\u0001\u0010\u00ad\u0001\"\u0006\b\u00c9\u0001\u0010\u00af\u0001R\u0012\u0010\u00ca\u0001\u001a\u0005\u0018\u00010\u00cb\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u00cc\u0001\u001a\u00020t8FX\u0086\u0084\u0002\u00a2\u0006\u000e\n\u0005\b\u00ce\u0001\u0010#\u001a\u0005\b\u00cd\u0001\u0010vR\u001d\u0010\u00cf\u0001\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00d0\u0001\u0010\r\"\u0005\b\u00d1\u0001\u0010:R \u0010\u00d2\u0001\u001a\u00030\u00d3\u00018FX\u0086\u0084\u0002\u00a2\u0006\u000f\n\u0005\b\u00d6\u0001\u0010#\u001a\u0006\b\u00d4\u0001\u0010\u00d5\u0001R\u001d\u0010\u00d7\u0001\u001a\u00020-X\u0080\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00d8\u0001\u0010/\"\u0005\b\u00d9\u0001\u00101R\u001e\u0010\u00da\u0001\u001a\u00020t8FX\u0086\u0084\u0002\u00a2\u0006\u000e\n\u0005\b\u00dc\u0001\u0010#\u001a\u0005\b\u00db\u0001\u0010vR\u0017\u0010\u00dd\u0001\u001a\u0005\u0018\u00010\u00de\u0001\u00a2\u0006\n\n\u0000\u001a\u0006\b\u00df\u0001\u0010\u00e0\u0001R\u0012\u0010\u00e1\u0001\u001a\u0005\u0018\u00010\u00e2\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u00e3\u0001\u001a\u00020t8FX\u0086\u0084\u0002\u00a2\u0006\u000e\n\u0005\b\u00e5\u0001\u0010#\u001a\u0005\b\u00e4\u0001\u0010vR!\u0010\u00e6\u0001\u001a\u0004\u0018\u00010kX\u0086\u000e\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u00e7\u0001\u0010\u00e8\u0001\"\u0006\b\u00e9\u0001\u0010\u00ea\u0001R \u0010\u00eb\u0001\u001a\u00030\u00ec\u00018FX\u0086\u0084\u0002\u00a2\u0006\u000f\n\u0005\b\u00ef\u0001\u0010#\u001a\u0006\b\u00ed\u0001\u0010\u00ee\u0001R\u000f\u0010\u00f0\u0001\u001a\u00020-X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u00f1\u0001\u001a\u00020t8FX\u0086\u0084\u0002\u00a2\u0006\u000e\n\u0005\b\u00f3\u0001\u0010#\u001a\u0005\b\u00f2\u0001\u0010vR \u0010\u00f4\u0001\u001a\u00030\u00f5\u00018FX\u0086\u0084\u0002\u00a2\u0006\u000f\n\u0005\b\u00f8\u0001\u0010#\u001a\u0006\b\u00f6\u0001\u0010\u00f7\u0001R \u0010\u00f9\u0001\u001a\u00030\u00fa\u00018FX\u0086\u0084\u0002\u00a2\u0006\u000f\n\u0005\b\u00fd\u0001\u0010#\u001a\u0006\b\u00fb\u0001\u0010\u00fc\u0001R!\u0010\u00fe\u0001\u001a\u0004\u0018\u00010kX\u0080\u000e\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u00ff\u0001\u0010\u00e8\u0001\"\u0006\b\u0080\u0002\u0010\u00ea\u0001R\u001e\u0010\u0081\u0002\u001a\u00020J8FX\u0086\u0084\u0002\u00a2\u0006\u000e\n\u0005\b\u0083\u0002\u0010#\u001a\u0005\b\u0082\u0002\u0010LR\u001e\u0010\u0084\u0002\u001a\u00020t8FX\u0086\u0084\u0002\u00a2\u0006\u000e\n\u0005\b\u0086\u0002\u0010#\u001a\u0005\b\u0085\u0002\u0010vR#\u0010\u0087\u0002\u001a\b\u0012\u0004\u0012\u00020\u000b0<X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0088\u0002\u0010>\"\u0005\b\u0089\u0002\u0010@R\u001e\u0010\u008a\u0002\u001a\u00020J8FX\u0086\u0084\u0002\u00a2\u0006\u000e\n\u0005\b\u008c\u0002\u0010#\u001a\u0005\b\u008b\u0002\u0010LR\u0016\u0010\u008d\u0002\u001a\u00020\u000bX\u0086D\u00a2\u0006\t\n\u0000\u001a\u0005\b\u008e\u0002\u0010\rR\u001e\u0010\u008f\u0002\u001a\u00020J8FX\u0086\u0084\u0002\u00a2\u0006\u000e\n\u0005\b\u0091\u0002\u0010#\u001a\u0005\b\u0090\u0002\u0010LR\u001e\u0010\u0092\u0002\u001a\u00020t8FX\u0086\u0084\u0002\u00a2\u0006\u000e\n\u0005\b\u0094\u0002\u0010#\u001a\u0005\b\u0093\u0002\u0010vR\u001d\u0010\u0095\u0002\u001a\u00020-X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0096\u0002\u0010/\"\u0005\b\u0097\u0002\u00101R\u001e\u0010\u0098\u0002\u001a\u00020]8FX\u0086\u0084\u0002\u00a2\u0006\u000e\n\u0005\b\u009a\u0002\u0010#\u001a\u0005\b\u0099\u0002\u0010_R\u001e\u0010\u009b\u0002\u001a\u00020t8FX\u0086\u0084\u0002\u00a2\u0006\u000e\n\u0005\b\u009d\u0002\u0010#\u001a\u0005\b\u009c\u0002\u0010vR \u0010\u009e\u0002\u001a\u00030\u00ec\u00018FX\u0086\u0084\u0002\u00a2\u0006\u000f\n\u0005\b\u00a0\u0002\u0010#\u001a\u0006\b\u009f\u0002\u0010\u00ee\u0001R\u0016\u0010\u00a1\u0002\u001a\u00020\u000bX\u0086D\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00a2\u0002\u0010\rR\"\u0010\u00a3\u0002\u001a\u0005\u0018\u00010\u00c6\u0001X\u0086\u000e\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u00a4\u0002\u0010\u00a5\u0002\"\u0006\b\u00a6\u0002\u0010\u00a7\u0002R\u001e\u0010\u00a8\u0002\u001a\u00020t8FX\u0086\u0084\u0002\u00a2\u0006\u000e\n\u0005\b\u00aa\u0002\u0010#\u001a\u0005\b\u00a9\u0002\u0010vR \u0010\u00ab\u0002\u001a\u00030\u00d3\u00018FX\u0086\u0084\u0002\u00a2\u0006\u000f\n\u0005\b\u00ad\u0002\u0010#\u001a\u0006\b\u00ac\u0002\u0010\u00d5\u0001\u00a8\u0006\u009a\u0003"}, d2 = {"Lcom/zoomapps/eromance/Activities/MapsActivity;", "Lcom/zoomapps/eromance/BaseActivity;", "Lcom/google/android/gms/maps/GoogleMap$OnMapClickListener;", "Lcom/google/android/gms/maps/OnMapReadyCallback;", "Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;", "Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;", "Lcom/google/android/gms/location/LocationListener;", "Lcom/zoomapps/eromance/Interfaces/MapDialogInterface;", "Lcom/google/android/gms/maps/GoogleMap$OnMarkerClickListener;", "()V", "ADDED_UI", "", "getADDED_UI", "()I", "MARKER_FEMALE", "getMARKER_FEMALE", "MARKER_MALE", "getMARKER_MALE", "MARKER_ME", "getMARKER_ME", "MARKER_SELECTED_FEMALE", "getMARKER_SELECTED_FEMALE", "MARKER_SELECTED_MALE", "getMARKER_SELECTED_MALE", "MARKER_SELECTED_ME", "getMARKER_SELECTED_ME", "REMOVED_UI", "getREMOVED_UI", "RQS_GooglePlayServices", "getRQS_GooglePlayServices$app_debug", "address_ED", "Landroid/widget/EditText;", "getAddress_ED", "()Landroid/widget/EditText;", "address_ED$delegate", "Lkotlin/properties/ReadOnlyProperty;", "allRawMarkerData", "", "Lcom/zoomapps/eromance/Models/MapModels$Datum;", "Lcom/zoomapps/eromance/Models/MapModels;", "getAllRawMarkerData", "()Ljava/util/List;", "setAllRawMarkerData", "(Ljava/util/List;)V", "asked_once", "", "getAsked_once$app_debug", "()Z", "setAsked_once$app_debug", "(Z)V", "bottomSheet", "Landroid/view/View;", "getBottomSheet", "()Landroid/view/View;", "bottomSheet$delegate", "bottomUI_type", "getBottomUI_type", "setBottomUI_type", "(I)V", "bottomUserListData", "Ljava/util/ArrayList;", "getBottomUserListData", "()Ljava/util/ArrayList;", "setBottomUserListData", "(Ljava/util/ArrayList;)V", "bottom_RL", "Landroid/widget/RelativeLayout;", "getBottom_RL", "()Landroid/widget/RelativeLayout;", "bottom_RL$delegate", "btnOpenDrawer", "getBtnOpenDrawer", "btnOpenDrawer$delegate", "cancel_btn", "Landroid/widget/Button;", "getCancel_btn", "()Landroid/widget/Button;", "cancel_btn$delegate", "checkedSex", "getCheckedSex", "()Ljava/lang/Integer;", "setCheckedSex", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "checkedTypesList", "getCheckedTypesList", "setCheckedTypesList", "create_fab_btn", "Landroid/support/design/widget/FloatingActionButton;", "getCreate_fab_btn", "()Landroid/support/design/widget/FloatingActionButton;", "create_fab_btn$delegate", "cur_city_NAV_TV", "Landroid/widget/TextView;", "getCur_city_NAV_TV", "()Landroid/widget/TextView;", "cur_city_NAV_TV$delegate", "cur_coins_NAV_TV", "getCur_coins_NAV_TV", "cur_coins_NAV_TV$delegate", "cur_country_NAV_TV", "getCur_country_NAV_TV", "cur_country_NAV_TV$delegate", "cur_username_NAV_TV", "getCur_username_NAV_TV", "cur_username_NAV_TV$delegate", "dataSet", "", "getDataSet$app_debug", "setDataSet$app_debug", "drawer_layout", "Landroid/support/v4/widget/DrawerLayout;", "getDrawer_layout", "()Landroid/support/v4/widget/DrawerLayout;", "drawer_layout$delegate", "eveningPlans_NAV_LL", "Landroid/widget/LinearLayout;", "getEveningPlans_NAV_LL", "()Landroid/widget/LinearLayout;", "eveningPlans_NAV_LL$delegate", "filterData", "", "Lcom/zoomapps/eromance/Models/MapsModels$FilterItems;", "getFilterData", "setFilterData", "filter_IV", "Landroid/widget/ImageView;", "getFilter_IV", "()Landroid/widget/ImageView;", "filter_IV$delegate", "filter_container", "getFilter_container", "filter_container$delegate", "forse_set", "getForse_set", "setForse_set", "games_NAV_LL", "getGames_NAV_LL", "games_NAV_LL$delegate", "ifFilterOpen", "getIfFilterOpen", "setIfFilterOpen", "isPointSet", "setPointSet", "isTaskActive", "setTaskActive", "isTrackEnabled", "setTrackEnabled", "isZoomedToMyLocationOnce", "setZoomedToMyLocationOnce", "lastState", "getLastState", "setLastState", "locationUpdateDelayPast", "getLocationUpdateDelayPast", "setLocationUpdateDelayPast", "locationUpdateHandler", "Lcom/zoomapps/eromance/Activities/MapsActivity$LocationUpdateHandler;", "getLocationUpdateHandler", "()Lcom/zoomapps/eromance/Activities/MapsActivity$LocationUpdateHandler;", "mAdapter", "Lcom/zoomapps/eromance/Adapters/MapBottomUserListAdapter;", "getMAdapter", "()Lcom/zoomapps/eromance/Adapters/MapBottomUserListAdapter;", "mBottomSheetBehavior", "Landroid/support/design/widget/BottomSheetBehavior;", "getMBottomSheetBehavior", "()Landroid/support/design/widget/BottomSheetBehavior;", "setMBottomSheetBehavior", "(Landroid/support/design/widget/BottomSheetBehavior;)V", "mBottomTypesAdapter", "Landroid/support/v7/widget/RecyclerView$Adapter;", "getMBottomTypesAdapter", "()Landroid/support/v7/widget/RecyclerView$Adapter;", "setMBottomTypesAdapter", "(Landroid/support/v7/widget/RecyclerView$Adapter;)V", "mGoogleApiClient", "Lcom/google/android/gms/common/api/GoogleApiClient;", "getMGoogleApiClient", "()Lcom/google/android/gms/common/api/GoogleApiClient;", "setMGoogleApiClient", "(Lcom/google/android/gms/common/api/GoogleApiClient;)V", "mHandler", "Landroid/os/Handler;", "mInterval", "mLayoutManagerForSetPointTypes", "Landroid/support/v7/widget/LinearLayoutManager;", "getMLayoutManagerForSetPointTypes", "()Landroid/support/v7/widget/LinearLayoutManager;", "setMLayoutManagerForSetPointTypes", "(Landroid/support/v7/widget/LinearLayoutManager;)V", "mLocationRequest", "Lcom/google/android/gms/location/LocationRequest;", "getMLocationRequest", "()Lcom/google/android/gms/location/LocationRequest;", "setMLocationRequest", "(Lcom/google/android/gms/location/LocationRequest;)V", "mSelectedMarker", "Lcom/google/android/gms/maps/model/Marker;", "mTopFilterAdapter", "getMTopFilterAdapter", "setMTopFilterAdapter", "mTopFilterLayoutManager", "Landroid/support/v7/widget/RecyclerView$LayoutManager;", "map_NAV_LL", "getMap_NAV_LL", "map_NAV_LL$delegate", "maxBottomSheetHeight", "getMaxBottomSheetHeight", "setMaxBottomSheetHeight", "men_CB", "Landroid/widget/CheckBox;", "getMen_CB", "()Landroid/widget/CheckBox;", "men_CB$delegate", "menu_btn_sbsed", "getMenu_btn_sbsed$app_debug", "setMenu_btn_sbsed$app_debug", "momentMeets_NAV_LL", "getMomentMeets_NAV_LL", "momentMeets_NAV_LL$delegate", "myLastLoc", "Lcom/google/android/gms/maps/model/LatLng;", "getMyLastLoc", "()Lcom/google/android/gms/maps/model/LatLng;", "myMap", "Lcom/google/android/gms/maps/GoogleMap;", "myProfile_NAV_LL", "getMyProfile_NAV_LL", "myProfile_NAV_LL$delegate", "mylastPoint_id", "getMylastPoint_id", "()Ljava/lang/String;", "setMylastPoint_id", "(Ljava/lang/String;)V", "nav_recyclerView", "Landroid/support/v7/widget/RecyclerView;", "getNav_recyclerView", "()Landroid/support/v7/widget/RecyclerView;", "nav_recyclerView$delegate", "permissionIsGranted", "placesForRest_NAV_LL", "getPlacesForRest_NAV_LL", "placesForRest_NAV_LL$delegate", "point_users_RV", "Lcom/zoomapps/eromance/Helpers/CustomRecyclerView;", "getPoint_users_RV", "()Lcom/zoomapps/eromance/Helpers/CustomRecyclerView;", "point_users_RV$delegate", "profile_image_CIV", "Lde/hdodenhof/circleimageview/CircleImageView;", "getProfile_image_CIV", "()Lde/hdodenhof/circleimageview/CircleImageView;", "profile_image_CIV$delegate", "provider", "getProvider$app_debug", "setProvider$app_debug", "removePoint_BTN", "getRemovePoint_BTN", "removePoint_BTN$delegate", "searchPair_NAV_LL", "getSearchPair_NAV_LL", "searchPair_NAV_LL$delegate", "selectedTypeList", "getSelectedTypeList", "setSelectedTypeList", "send_btn", "getSend_btn", "send_btn$delegate", "setMarkerView", "getSetMarkerView", "set_point_btn", "getSet_point_btn", "set_point_btn$delegate", "settings_NAV_LL", "getSettings_NAV_LL", "settings_NAV_LL$delegate", "sheetIsActive", "getSheetIsActive", "setSheetIsActive", "tv_map", "getTv_map", "tv_map$delegate", "twentyOne_NAV_LL", "getTwentyOne_NAV_LL", "twentyOne_NAV_LL$delegate", "types_RV", "getTypes_RV", "types_RV$delegate", "userListView", "getUserListView", "userSetMarker", "getUserSetMarker", "()Lcom/google/android/gms/maps/model/Marker;", "setUserSetMarker", "(Lcom/google/android/gms/maps/model/Marker;)V", "user_list_container", "getUser_list_container", "user_list_container$delegate", "woman_CB", "getWoman_CB", "woman_CB$delegate", "checkMyPoints", "", "checkType", "type", "clearMarker", "closeTopView", "createMarker", "latitude", "", "longitude", "title", "snippet", "sex_id", "user_id", "(DDLjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/google/android/gms/maps/model/Marker;", "filterList", "getBitmap", "Landroid/graphics/Bitmap;", "context", "Landroid/content/Context;", "drawableId", "vectorDrawable", "Landroid/graphics/drawable/VectorDrawable;", "getColorById", "id", "getImageRes", "Lcom/google/android/gms/maps/model/BitmapDescriptor;", "getMarkers", "isNeedFind", "filter_types", "filter_sex", "(Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/Integer;)V", "getSexById", "uid", "getTypeByInfo", "isSelected", "(Ljava/lang/Integer;Z)Ljava/lang/Integer;", "hideKeyBoard", "initButtonToolbar", "init_TypesRVforSetPoint", "init_bottom_view", "init_fab_btn", "init_filter_action", "init_map_actions", "init_menu", "listenPosition", "onCameraDenied", "onCameraNeverAskAgain", "onConnected", "p0", "Landroid/os/Bundle;", "onConnectionFailed", "Lcom/google/android/gms/common/ConnectionResult;", "onConnectionSuspended", "onCreate", "savedInstanceState", "onDestroy", "onLocationChanged", "Landroid/location/Location;", "onMapClick", "point", "onMapReady", "map", "onMarkerClick", "onResume", "onStart", "onStop", "openTopView", "postMarkerPoint", "lat", "lng", "isUpdate", "preparePoints", "recyclerViewArray", "removePoint", "removeSex", "removeType", "setBottomUserList", "userId", "setBottomViewType", "viewType", "setDialogResult", "setMarkerIcon", "p1", "setMenuClicks", "setMyPointMarker", "latlng", "setSex", "setType", "showBottomView", "show", "showCamera", "showFilterDialog", "showRationaleDialog", "messageResId", "request", "Lpermissions/dispatcher/PermissionRequest;", "showRationaleForCamera", "startRepeatingTask", "stopRepeatingTask", "subscribe_to_location_update", "textGradient", "turnGPSOn", "updateBottomUI", "newType", "zoomToMyLocation", "Companion", "LocationUpdateHandler", "app_debug"})
public final class MapsActivity extends com.zoomapps.eromance.BaseActivity implements com.google.android.gms.maps.GoogleMap.OnMapClickListener, com.google.android.gms.maps.OnMapReadyCallback, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener, com.google.android.gms.location.LocationListener, com.zoomapps.eromance.Interfaces.MapDialogInterface, com.google.android.gms.maps.GoogleMap.OnMarkerClickListener {
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer checkedSex;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<java.lang.Integer> checkedTypesList;
    private boolean locationUpdateDelayPast;
    private boolean isZoomedToMyLocationOnce;
    @org.jetbrains.annotations.Nullable()
    private final com.google.android.gms.maps.model.LatLng myLastLoc = null;
    private boolean isTaskActive;
    private boolean isTrackEnabled;
    private final int mInterval = 60000;
    private android.os.Handler mHandler;
    @org.jetbrains.annotations.NotNull()
    private final com.zoomapps.eromance.Activities.MapsActivity.LocationUpdateHandler locationUpdateHandler = null;
    private boolean asked_once;
    private final int RQS_GooglePlayServices = 1;
    private com.google.android.gms.maps.GoogleMap myMap;
    private boolean menu_btn_sbsed;
    private boolean permissionIsGranted;
    @org.jetbrains.annotations.Nullable()
    private java.util.ArrayList<java.lang.String> dataSet;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty drawer_layout$delegate = null;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String provider;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty btnOpenDrawer$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty tv_map$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty types_RV$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty address_ED$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty set_point_btn$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty filter_container$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty men_CB$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty woman_CB$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty filter_IV$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty send_btn$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty cancel_btn$delegate = null;
    private boolean ifFilterOpen;
    @org.jetbrains.annotations.Nullable()
    private android.support.v7.widget.RecyclerView.Adapter<?> mTopFilterAdapter;
    private android.support.v7.widget.RecyclerView.LayoutManager mTopFilterLayoutManager;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty myProfile_NAV_LL$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty searchPair_NAV_LL$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty momentMeets_NAV_LL$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty placesForRest_NAV_LL$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty eveningPlans_NAV_LL$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty map_NAV_LL$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty games_NAV_LL$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty twentyOne_NAV_LL$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty settings_NAV_LL$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty cur_username_NAV_TV$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty cur_country_NAV_TV$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty cur_city_NAV_TV$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty cur_coins_NAV_TV$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty nav_recyclerView$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty profile_image_CIV$delegate = null;
    @org.jetbrains.annotations.Nullable()
    private java.util.List<com.zoomapps.eromance.Models.MapModels.Datum> allRawMarkerData;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty removePoint_BTN$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty create_fab_btn$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.zoomapps.eromance.Models.MapModels.Datum> bottomUserListData;
    @org.jetbrains.annotations.NotNull()
    private final com.zoomapps.eromance.Adapters.MapBottomUserListAdapter mAdapter = null;
    private int lastState;
    private int maxBottomSheetHeight;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty bottomSheet$delegate = null;
    @org.jetbrains.annotations.Nullable()
    private android.support.design.widget.BottomSheetBehavior<android.view.View> mBottomSheetBehavior;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty user_list_container$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty point_users_RV$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty bottom_RL$delegate = null;
    private final int setMarkerView = 0;
    private final int userListView = 1;
    private final int REMOVED_UI = 0;
    private final int ADDED_UI = 1;
    private int bottomUI_type;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<java.lang.Integer> selectedTypeList;
    private boolean sheetIsActive;
    @org.jetbrains.annotations.Nullable()
    private android.support.v7.widget.LinearLayoutManager mLayoutManagerForSetPointTypes;
    @org.jetbrains.annotations.Nullable()
    private android.support.v7.widget.RecyclerView.Adapter<?> mBottomTypesAdapter;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.zoomapps.eromance.Models.MapsModels.FilterItems> filterData;
    private final int MARKER_SELECTED_MALE = 0;
    private final int MARKER_SELECTED_FEMALE = 1;
    private final int MARKER_SELECTED_ME = 2;
    private final int MARKER_MALE = 3;
    private final int MARKER_FEMALE = 4;
    private final int MARKER_ME = 5;
    private com.google.android.gms.maps.model.Marker mSelectedMarker;
    private boolean isPointSet;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String mylastPoint_id;
    private boolean forse_set;
    @org.jetbrains.annotations.Nullable()
    private com.google.android.gms.maps.model.Marker userSetMarker;
    @org.jetbrains.annotations.Nullable()
    private com.google.android.gms.common.api.GoogleApiClient mGoogleApiClient;
    @org.jetbrains.annotations.Nullable()
    private com.google.android.gms.location.LocationRequest mLocationRequest;
    private static final int MY_PERMISSON_REQUEST_FINE_LOCATION = 101;
    private static final int MY_PERMISSON_REQUEST_COARSE_LOCATION = 102;
    public static final com.zoomapps.eromance.Activities.MapsActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getCheckedSex() {
        return null;
    }
    
    public final void setCheckedSex(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @java.lang.Override()
    public void setDialogResult() {
    }
    
    @permissions.dispatcher.NeedsPermission(value = {"android.permission.ACCESS_FINE_LOCATION"})
    public final void showCamera() {
    }
    
    @permissions.dispatcher.OnPermissionDenied(value = {"android.permission.ACCESS_FINE_LOCATION"})
    public final void onCameraDenied() {
    }
    
    @permissions.dispatcher.OnShowRationale(value = {"android.permission.ACCESS_FINE_LOCATION"})
    public final void showRationaleForCamera(@org.jetbrains.annotations.NotNull()
    permissions.dispatcher.PermissionRequest request) {
    }
    
    @permissions.dispatcher.OnNeverAskAgain(value = {"android.permission.ACCESS_FINE_LOCATION"})
    public final void onCameraNeverAskAgain() {
    }
    
    private final void showRationaleDialog(java.lang.String messageResId, permissions.dispatcher.PermissionRequest request) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<java.lang.Integer> getCheckedTypesList() {
        return null;
    }
    
    public final void setCheckedTypesList(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.Integer> p0) {
    }
    
    @java.lang.Override()
    public void setType(int type) {
    }
    
    @java.lang.Override()
    public void removeType(int type) {
    }
    
    @java.lang.Override()
    public boolean checkType(int type) {
        return false;
    }
    
    @java.lang.Override()
    public void setSex(int type) {
    }
    
    @java.lang.Override()
    public void removeSex(int type) {
    }
    
    public final boolean getLocationUpdateDelayPast() {
        return false;
    }
    
    public final void setLocationUpdateDelayPast(boolean p0) {
    }
    
    public final boolean isZoomedToMyLocationOnce() {
        return false;
    }
    
    public final void setZoomedToMyLocationOnce(boolean p0) {
    }
    
    public final void zoomToMyLocation(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.maps.model.LatLng p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.google.android.gms.maps.model.LatLng getMyLastLoc() {
        return null;
    }
    
    public final boolean isTaskActive() {
        return false;
    }
    
    public final void setTaskActive(boolean p0) {
    }
    
    public final boolean isTrackEnabled() {
        return false;
    }
    
    public final void setTrackEnabled(boolean p0) {
    }
    
    @java.lang.Override()
    public void onLocationChanged(@org.jetbrains.annotations.Nullable()
    android.location.Location p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.zoomapps.eromance.Activities.MapsActivity.LocationUpdateHandler getLocationUpdateHandler() {
        return null;
    }
    
    public final void setMyPointMarker(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.maps.model.LatLng latlng) {
    }
    
    @android.annotation.SuppressLint(value = {"MissingPermission"})
    @java.lang.Override()
    public void onConnected(@org.jetbrains.annotations.Nullable()
    android.os.Bundle p0) {
    }
    
    @java.lang.Override()
    public void onConnectionSuspended(int p0) {
    }
    
    @java.lang.Override()
    public void onConnectionFailed(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.common.ConnectionResult p0) {
    }
    
    public final boolean getAsked_once$app_debug() {
        return false;
    }
    
    public final void setAsked_once$app_debug(boolean p0) {
    }
    
    public final int getRQS_GooglePlayServices$app_debug() {
        return 0;
    }
    
    public final boolean getMenu_btn_sbsed$app_debug() {
        return false;
    }
    
    public final void setMenu_btn_sbsed$app_debug(boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.ArrayList<java.lang.String> getDataSet$app_debug() {
        return null;
    }
    
    public final void setDataSet$app_debug(@org.jetbrains.annotations.Nullable()
    java.util.ArrayList<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.support.v4.widget.DrawerLayout getDrawer_layout() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getProvider$app_debug() {
        return null;
    }
    
    public final void setProvider$app_debug(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.RelativeLayout getBtnOpenDrawer() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getTv_map() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.support.v7.widget.RecyclerView getTypes_RV() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.EditText getAddress_ED() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.Button getSet_point_btn() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.LinearLayout getFilter_container() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.CheckBox getMen_CB() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.CheckBox getWoman_CB() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.ImageView getFilter_IV() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.Button getSend_btn() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.Button getCancel_btn() {
        return null;
    }
    
    public final boolean getIfFilterOpen() {
        return false;
    }
    
    public final void setIfFilterOpen(boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.support.v7.widget.RecyclerView.Adapter<?> getMTopFilterAdapter() {
        return null;
    }
    
    public final void setMTopFilterAdapter(@org.jetbrains.annotations.Nullable()
    android.support.v7.widget.RecyclerView.Adapter<?> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.LinearLayout getMyProfile_NAV_LL() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.LinearLayout getSearchPair_NAV_LL() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.LinearLayout getMomentMeets_NAV_LL() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.LinearLayout getPlacesForRest_NAV_LL() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.LinearLayout getEveningPlans_NAV_LL() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.LinearLayout getMap_NAV_LL() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.LinearLayout getGames_NAV_LL() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.LinearLayout getTwentyOne_NAV_LL() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.LinearLayout getSettings_NAV_LL() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getCur_username_NAV_TV() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getCur_country_NAV_TV() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getCur_city_NAV_TV() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getCur_coins_NAV_TV() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.support.v7.widget.RecyclerView getNav_recyclerView() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final de.hdodenhof.circleimageview.CircleImageView getProfile_image_CIV() {
        return null;
    }
    
    public final void setMenuClicks() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.google.android.gms.maps.model.Marker createMarker(double latitude, double longitude, @org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.Nullable()
    java.lang.String snippet, @org.jetbrains.annotations.Nullable()
    java.lang.Integer sex_id, @org.jetbrains.annotations.Nullable()
    java.lang.Integer user_id) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.zoomapps.eromance.Models.MapModels.Datum> getAllRawMarkerData() {
        return null;
    }
    
    public final void setAllRawMarkerData(@org.jetbrains.annotations.Nullable()
    java.util.List<com.zoomapps.eromance.Models.MapModels.Datum> p0) {
    }
    
    public final void getMarkers(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean isNeedFind, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.Integer> filter_types, @org.jetbrains.annotations.Nullable()
    java.lang.Integer filter_sex) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.Button getRemovePoint_BTN() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.support.design.widget.FloatingActionButton getCreate_fab_btn() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.zoomapps.eromance.Models.MapModels.Datum> getBottomUserListData() {
        return null;
    }
    
    public final void setBottomUserListData(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.zoomapps.eromance.Models.MapModels.Datum> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.zoomapps.eromance.Adapters.MapBottomUserListAdapter getMAdapter() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.zoomapps.eromance.Models.MapsModels.FilterItems> filterList() {
        return null;
    }
    
    public final void startRepeatingTask() {
    }
    
    public final void stopRepeatingTask() {
    }
    
    public final void closeTopView() {
    }
    
    public final void openTopView() {
    }
    
    public final void showFilterDialog() {
    }
    
    public final int getLastState() {
        return 0;
    }
    
    public final void setLastState(int p0) {
    }
    
    public final int getMaxBottomSheetHeight() {
        return 0;
    }
    
    public final void setMaxBottomSheetHeight(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.view.View getBottomSheet() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.support.design.widget.BottomSheetBehavior<android.view.View> getMBottomSheetBehavior() {
        return null;
    }
    
    public final void setMBottomSheetBehavior(@org.jetbrains.annotations.Nullable()
    android.support.design.widget.BottomSheetBehavior<android.view.View> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.LinearLayout getUser_list_container() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.zoomapps.eromance.Helpers.CustomRecyclerView getPoint_users_RV() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.RelativeLayout getBottom_RL() {
        return null;
    }
    
    public final void init_fab_btn() {
    }
    
    public final void showBottomView(boolean show, int type) {
    }
    
    public final int getSetMarkerView() {
        return 0;
    }
    
    public final int getUserListView() {
        return 0;
    }
    
    public final void setBottomViewType(int viewType) {
    }
    
    public final int getREMOVED_UI() {
        return 0;
    }
    
    public final int getADDED_UI() {
        return 0;
    }
    
    public final int getBottomUI_type() {
        return 0;
    }
    
    public final void setBottomUI_type(int p0) {
    }
    
    public final void updateBottomUI(int newType) {
    }
    
    public final void hideKeyBoard() {
    }
    
    public final void init_bottom_view() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<java.lang.Integer> getSelectedTypeList() {
        return null;
    }
    
    public final void setSelectedTypeList(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.Integer> p0) {
    }
    
    public final boolean getSheetIsActive() {
        return false;
    }
    
    public final void setSheetIsActive(boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.support.v7.widget.LinearLayoutManager getMLayoutManagerForSetPointTypes() {
        return null;
    }
    
    public final void setMLayoutManagerForSetPointTypes(@org.jetbrains.annotations.Nullable()
    android.support.v7.widget.LinearLayoutManager p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.support.v7.widget.RecyclerView.Adapter<?> getMBottomTypesAdapter() {
        return null;
    }
    
    public final void setMBottomTypesAdapter(@org.jetbrains.annotations.Nullable()
    android.support.v7.widget.RecyclerView.Adapter<?> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.zoomapps.eromance.Models.MapsModels.FilterItems> getFilterData() {
        return null;
    }
    
    public final void setFilterData(@org.jetbrains.annotations.NotNull()
    java.util.List<com.zoomapps.eromance.Models.MapsModels.FilterItems> p0) {
    }
    
    public final void removePoint() {
    }
    
    public final void init_TypesRVforSetPoint() {
    }
    
    public final boolean setBottomUserList(@org.jetbrains.annotations.NotNull()
    java.lang.String userId) {
        return false;
    }
    
    public final int getMARKER_SELECTED_MALE() {
        return 0;
    }
    
    public final int getMARKER_SELECTED_FEMALE() {
        return 0;
    }
    
    public final int getMARKER_SELECTED_ME() {
        return 0;
    }
    
    public final int getMARKER_MALE() {
        return 0;
    }
    
    public final int getMARKER_FEMALE() {
        return 0;
    }
    
    public final int getMARKER_ME() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.gms.maps.model.BitmapDescriptor getImageRes(int type) {
        return null;
    }
    
    @android.annotation.TargetApi(value = android.os.Build.VERSION_CODES.LOLLIPOP)
    private final android.graphics.Bitmap getBitmap(android.graphics.drawable.VectorDrawable vectorDrawable) {
        return null;
    }
    
    private final android.graphics.Bitmap getBitmap(android.content.Context context, int drawableId) {
        return null;
    }
    
    public final void setMarkerIcon(int type, @org.jetbrains.annotations.NotNull()
    com.google.android.gms.maps.model.Marker p1) {
    }
    
    public final int getSexById(int uid) {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getTypeByInfo(@org.jetbrains.annotations.Nullable()
    java.lang.Integer sex_id, boolean isSelected) {
        return null;
    }
    
    @java.lang.Override()
    public boolean onMarkerClick(@org.jetbrains.annotations.Nullable()
    com.google.android.gms.maps.model.Marker p0) {
        return false;
    }
    
    @java.lang.Override()
    public void onMapReady(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.maps.GoogleMap map) {
    }
    
    public final void init_filter_action() {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    @java.lang.Override()
    public void onMapClick(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.maps.model.LatLng point) {
    }
    
    public final boolean isPointSet() {
        return false;
    }
    
    public final void setPointSet(boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMylastPoint_id() {
        return null;
    }
    
    public final void setMylastPoint_id(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final boolean getForse_set() {
        return false;
    }
    
    public final void setForse_set(boolean p0) {
    }
    
    public final void preparePoints() {
    }
    
    public final void checkMyPoints() {
    }
    
    public final void postMarkerPoint(@org.jetbrains.annotations.NotNull()
    java.lang.String lat, @org.jetbrains.annotations.NotNull()
    java.lang.String lng, boolean isUpdate) {
    }
    
    public final void clearMarker() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.google.android.gms.maps.model.Marker getUserSetMarker() {
        return null;
    }
    
    public final void setUserSetMarker(@org.jetbrains.annotations.Nullable()
    com.google.android.gms.maps.model.Marker p0) {
    }
    
    private final void init_menu() {
    }
    
    private final void initButtonToolbar() {
    }
    
    private final void subscribe_to_location_update() {
    }
    
    private final void init_map_actions() {
    }
    
    public final void turnGPSOn() {
    }
    
    public final void listenPosition() {
    }
    
    public final int getColorById(int id) {
        return 0;
    }
    
    private final void textGradient() {
    }
    
    private final void recyclerViewArray() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.google.android.gms.common.api.GoogleApiClient getMGoogleApiClient() {
        return null;
    }
    
    public final void setMGoogleApiClient(@org.jetbrains.annotations.Nullable()
    com.google.android.gms.common.api.GoogleApiClient p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.google.android.gms.location.LocationRequest getMLocationRequest() {
        return null;
    }
    
    public final void setMLocationRequest(@org.jetbrains.annotations.Nullable()
    com.google.android.gms.location.LocationRequest p0) {
    }
    
    @java.lang.Override()
    protected void onStart() {
    }
    
    @java.lang.Override()
    protected void onStop() {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    public MapsActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016\u00a8\u0006\u0005"}, d2 = {"Lcom/zoomapps/eromance/Activities/MapsActivity$LocationUpdateHandler;", "Ljava/lang/Runnable;", "(Lcom/zoomapps/eromance/Activities/MapsActivity;)V", "run", "", "app_debug"})
    public final class LocationUpdateHandler implements java.lang.Runnable {
        
        @java.lang.Override()
        public void run() {
        }
        
        public LocationUpdateHandler() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0082D\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006\u00a8\u0006\t"}, d2 = {"Lcom/zoomapps/eromance/Activities/MapsActivity$Companion;", "", "()V", "MY_PERMISSON_REQUEST_COARSE_LOCATION", "", "getMY_PERMISSON_REQUEST_COARSE_LOCATION", "()I", "MY_PERMISSON_REQUEST_FINE_LOCATION", "getMY_PERMISSON_REQUEST_FINE_LOCATION", "app_debug"})
    public static final class Companion {
        
        private final int getMY_PERMISSON_REQUEST_FINE_LOCATION() {
            return 0;
        }
        
        private final int getMY_PERMISSON_REQUEST_COARSE_LOCATION() {
            return 0;
        }
        
        private Companion() {
            super();
        }
    }
}