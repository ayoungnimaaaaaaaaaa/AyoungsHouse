//
//  FNMRealtimeRestaurantTableViewCell.swift
//  FindingNemo
//
//  Created by SeokWoo Lee on 2017. 9. 2..
//  Copyright © 2017년 SeokWoo Lee. All rights reserved.
//

import UIKit

class FNMRealtimeRestaurantTableViewCell: UITableViewCell {
    @IBOutlet private weak var thumbnailImageView: UIImageView!
    @IBOutlet private weak var nameLabel: UILabel!
    @IBOutlet private weak var kindLabel: UILabel!
    @IBOutlet private weak var locationLabel: UILabel!
    
    override func awakeFromNib() {
        super.awakeFromNib()
    }

    override func setSelected(_ selected: Bool, animated: Bool) {
        super.setSelected(selected, animated: animated)
    }
    
}
