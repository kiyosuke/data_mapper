package com.kiyosuke.datamapper.core

import java.io.Serializable

/**
 * Mapに対応させるEntityクラスに必ず継承させてください
 */
abstract class MutableMapper : MapOperator by MapOperatorImpl(), Serializable

