##############################################################################
#
# Copyright (c) 2004 TINY SPRL. (http://tiny.be) All Rights Reserved.
#                    Fabien Pinckaers <fp@tiny.Be>
#
# WARNING: This program as such is intended to be used by professional
# programmers who take the whole responsability of assessing all potential
# consequences resulting from its eventual inadequacies and bugs
# End users who are looking for a ready-to-use solution with commercial
# garantees and support are strongly adviced to contract a Free Software
# Service Company
#
# This program is Free Software; you can redistribute it and/or
# modify it under the terms of the GNU General Public License
# as published by the Free Software Foundation; either version 2
# of the License, or (at your option) any later version.
#
# This program is distributed in the hope that it will be useful,
# but WITHOUT ANY WARRANTY; without even the implied warranty of
# MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
# GNU General Public License for more details.
#
# You should have received a copy of the GNU General Public License
# along with this program; if not, write to the Free Software
# Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
#
##############################################################################

from osv import osv, fields

class karting_circuit(osv.osv):
    _name = 'karting.circuit'
    _columns = {
        'name': fields.char('Circuit',size=15,required=True),
    }
karting_circuit()

class karting_racer(osv.osv):
    _name = 'karting.racer'
    _columns = {
        'first_name': fields.char('First name',size=30,required=True),
        'last_name': fields.char('Last name',size=40,required=True),
        'birthdate': fields.date('Birthdate',required=True),
        'phone': fields.char('Phone',size=20),
        'email': fields.char('eMail',size=60),
        'address': fields.char('Address',size=60),
        'zip': fields.char('Zip',size=5),
        'city': fields.char('City',size=30),
        'state_id': fields.many2one('res.country.state','State'),
        'country_id': fields.many2one('res.country','Country'),
        'diary_racer_ids': fields.one2many('karting.diary.racer','racer_id','Races',readonly=True),
        'racer_group_ids': fields.many2many('karting.racer.group','karting_racer_group_rel','racer_id','racer_group_id','Racer Groups'),
    }
karting_racer()

class karting_diary(osv.osv):
    _name = 'karting.diary'
    _columns = {
        'date': fields.date('Date',required=True),
        'circuit_id': fields.many2one('karting.circuit','Circuit',required=True),
        'obs': fields.text('Observations'),
        'racer_ids': fields.one2many('karting.diary.racer','diary_id','Racers'),
        'round_ids': fields.one2many('karting.round','diary_id','Rounds'),
    }
karting_diary()

class karting_diary_racer(osv.osv):
    _name = 'karting.diary.racer'
    _columns = {
        'racer_id': fields.many2one('karting.racer','Racer',required=True),
        'diary_id': fields.many2one('karting.diary','Diary',required=True),
        'kart_type_id': fields.many2one('karting.kart_type','Type of kart',required=True),
        'group_id': fields.many2one('karting.racer.group','Group'),
        'tutor': fields.char('Tutor',size=40, help='Tutor, if the racer is a minor'),
        'tutor_doc': fields.char("Tutor's doc.",size=40, help='Document (type and number)'),
        'round_id': fields.many2one('karting.round','Round',required=True),
    }
karting_diary_racer()

class karting_kart_type(osv.osv):
    _name = 'karting.kart_type'
    _columns = {
        'name': fields.char('Type',size=30,required=True),
        'cilinder_capacity': fields.integer('Cilinder Capacity (cc)'),
    }
karting_kart_type()

class karting_racer_group(osv.osv):
    _name = 'karting.racer.group'
    _columns = {
        'name': fields.char('Group',size=30),
        'racer_ids': fields.many2many('karting.racer','karting_racer_group_rel','racer_group_id','racer_id','Racers'),
    }
karting_racer_group()

class karting_round(osv.osv):
    _name = 'karting.round'
    _columns = {
        'name': fields.float('Time'),
        'duration': fields.integer('Duration',required=True),
        'diary_id': fields.many2one('karting.diary','Diary'),
        'racer_ids': fields.one2many('karting.diary.racer','round_id','Racers',readonly=True),
    }
karting_round()

