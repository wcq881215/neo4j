/*
 * Copyright (c) 2002-2018 "Neo Technology,"
 * Network Engine for Objects in Lund AB [http://neotechnology.com]
 *
 * This file is part of Neo4j.
 *
 * Neo4j is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package org.neo4j.kernel.impl.newapi;

import org.neo4j.internal.kernel.api.SchemaReadWriteTestBase;
import org.neo4j.internal.kernel.api.schema.LabelSchemaDescriptor;
import org.neo4j.internal.kernel.api.schema.RelationTypeSchemaDescriptor;

import static org.neo4j.kernel.api.schema.SchemaDescriptorFactory.forRelType;

public class SchemaReadWriteTest extends SchemaReadWriteTestBase<EnterpriseWriteTestSupport>
{
    @Override
    public EnterpriseWriteTestSupport newTestSupport()
    {
        return new EnterpriseWriteTestSupport();
    }

    @Override
    protected LabelSchemaDescriptor labelDescriptor( int label, int... props )
    {
        return new org.neo4j.kernel.api.schema.LabelSchemaDescriptor( label, props );
    }

    @Override
    protected RelationTypeSchemaDescriptor typeDescriptor( int label, int...props )
    {
        return forRelType( label, props );
    }
}
